//package jpabasic.section5;
//
//import jpabasic.section5.domain.Member;
//import jpabasic.section5.domain.Team;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
///*
//    양방향 연관관계 주의 - 실습
//    • 순수 객체 상태를 고려해서 항상 양쪽에 값을 설정하자
//    • 연관관계 편의 메소드를 생성하자
//    • 양방향 매핑시에 무한 루프를 조심하자
//    • 예: toString(), lombok, JSON 생성 라이브러리
//    lombok에서 toString 쓰지말기.
//    Controller에서 Entity 반환하지 말기
//
//    양방향 매핑 정리
//    • 단방향 매핑만으로도 이미 연관관계 매핑은 완료
//    • 양방향 매핑은 반대 방향으로 조회(객체 그래프 탐색) 기능이 추가된 것 뿐
//    • JPQL에서 역방향으로 탐색할 일이 많음
//    • 단방향 매핑을 잘 하고 양방향은 필요할 때 추가해도 됨
//    (테이블에 영향을 주지 않음)
//
//    연관관계의 주인을 정하는 기준
//    • 비즈니스 로직을 기준으로 연관관계의 주인을 선택하면 안됨
//    • 연관관계의 주인은 외래 키의 위치를 기준으로 정해야함
//*/
//public class JpaMain2 {
//    public static void main(String[] args){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        try{
//            Member member = new Member();
//            member.setUsername("member1");
//
//
//            Team team = new Team();
//            team.setName("team1");
//            //올바르지 않은 예시(읽기 전용만 가능)
//            //team.getMembers().add(member);
//            em.persist(team);
//
//            //올바른 예시(연관관계 주인)
//            member.setTeam(team);// -> team.getMember.add(this) -> 내부로직에 팀 객체에 양방향 연결함
//            em.persist(member);
//
//            //team.addMember(member);// 둘중 하나만 작성해서 사용, 아니면 무한루프 걸림
//
//            //but 양방향 맵핑관계는 두개의 객체 모두 추가 해주어야한다.
//            //영속성 엔티티에서 1차캐시가 있을때 양방향 맵핑 해주지 않으면 데이터 읽지 못함.
//
//            Team findTeam = em.find(Team.class, team.getId());
//            List<Member> members = findTeam.getMembers();
//
//            System.out.println("==========================");
//            for(Member m : members) {
//                System.out.println("m : "+m.getUsername() + " / "+ m.getId());
//            }
//            System.out.println("==========================");
//
//            tx.commit();
//        }catch (Exception e){
//            tx.rollback();
//            e.printStackTrace();
//        }finally {
//            em.close();
//        }
//
//        emf.close();
//    }
//}
