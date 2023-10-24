//package jpabasic.section8;
//
//import jpabasic.section8.domain.Child;
//import jpabasic.section8.domain.Member;
//import jpabasic.section8.domain.Parent;
//import jpabasic.section8.domain.Team;
//import org.hibernate.Hibernate;
//
//import javax.persistence.*;
//import java.util.List;
//
//public class JpaMain {
//    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//    static EntityManager em = emf.createEntityManager();
//    static EntityTransaction tx = em.getTransaction();
//
//    public static void main(String[] args){
//        tx.begin();
//
//        try {
////            Team team = new Team();
////            team.setName("솔루션개발팀");
////            em.persist(team);
////
////            Member member1 = new Member();
////            member1.setUsername("member1");
////
////            team.getMembers().add(member1);
////            member1.setTeam(team);//member 테이블에 update 한번 더 진행해야함
////
////            em.persist(member1);
////
////            Member member2 = new Member();
////            member2.setUsername("member2");
////            em.persist(member2);
////            System.out.println("==========================");
////
////            em.flush();
////            em.clear();
////
////            //JPQL, 지연로딩
////            List<Member> members = em.createQuery("select m from Member m join fetch m.team", Member.class).getResultList();
////
////            /*
////                Proxy
////                -프록시 객체는 처음 사용할 때 한번만 초기화
////                -프록시 객체를 초기화 할 때, 프록시 객체가 실제 엔티티로 바뀌는 것은 아님
////                 초기화되면 프록시 객체를 통해서 실제 엔티티에 접근가능
////                -프록시 객체는 원본 엔티티를 상속받음, 따라서 타입 체크시 주의해야함(==비교 실패, 대신 instance of 사용)
////                -영속성 컨텍스트에 찾는 엔티티가 이미 있으면 em.getReference()를 호출해도 실제 엔티티 반환
////                -영속성 컨텍스트의 도움을 받을 수 없는 준영속 상태일때, 프록시 초기화하면 문제발생
////                (하이버네이트는 org.hibernate.LazyInitializationException 예외를 터트림)
////            */
////            Member findMember = em.find(Member.class, member1.getId());
////            Member refMember = em.getReference(Member.class, member1.getId());//프록시
//
//
////            //Team 조회시 프록시로 가져옴.
////            //FetchType.LAZY -> 지연로딩
////            System.out.println("findTeam : "+ findMember.getTeam().getClass());
////            System.out.println("==========================");
////            //findMember.getTeam().getName();
////            System.out.println("==========================");
//            //System.out.println("memberName : "+ refMember.getUsername());
////            System.out.println("refMember.class : "+refMember.getClass().getName());
////            System.out.println("findMember.class : "+ findMember.getClass().getName());
////            System.out.println("지연로딩 : "+ findMember.getTeam().getClass().getName());
////            System.out.println("a == a : "+ (refMember.getClass() == findMember.getClass()));
//
//            //Hibernate.initialize(refMember);//강제초기화
//
//            //printUserAndTeam(member.getId());
//            //printUser(member.getId());
//
//            //Cascade
//            /*
//                • 영속성 전이는 연관관계를 매핑하는 것과 아무 관련이 없음
//                • 엔티티를 영속화할 때 연관된 엔티티도 함께 영속화하는 편리함을 제공할 뿐
//            */
//            Child child1 = new Child();
//            Child child2 = new Child();
//
//            Parent parent = new Parent();
//            parent.addChild(child1);
//            parent.addChild(child2);
//
//            em.persist(parent);
////            em.persist(child1);
////            em.persist(child2);
//
//            em.flush();
//            em.clear();
//
//            //고아 객체
//            /*
//                • 참조가 제거된 엔티티는 다른 곳에서 참조하지 않는 고아 객체로 보고 삭제하는 기능
//                • 참조하는 곳이 하나일 때 사용해야함!
//                • 특정 엔티티가 개인 소유할 때 사용 -> 이때만 사용!!!!!!!!!!!!!!!!!
//                • @OneToOne, @OneToMany만 가능
//                • 참고: 개념적으로 부모를 제거하면 자식은 고아가 된다. 따라서 고아 객체 제거 기능을 활성화 하면, 부모를 제거할 때 자식도 함께 제거된다.
//                        이것은 CascadeType.REMOVE처럼 동작한다.
//                • CascadeType.ALL + orphanRemoval=true
//                • 스스로 생명주기를 관리하는 엔티티는 em.persist()로 영속화, em.remove()로 제거
//                • 두 옵션을 모두 활성화 하면 부모 엔티티를 통해서 자식의 생명주기를 관리할 수 있음
//                • 도메인 주도 설계(DDD)의 Aggregate Root개념을 구현할 때 유용
//            */
//            Parent findParent = em.find(Parent.class, parent.getId());
//            findParent.getChildList().remove(0);
//
//            tx.commit();
//        }catch(Exception e) {
//            tx.rollback();
//            //e.printStackTrace();
//        }finally {
//            em.close();
//        }
//
//        emf.close();
//    }
//
//    private static void printUser(Long memberId) {
//        Member member = em.find(Member.class, memberId);
//        Team team = member.getTeam();
//        System.out.println("회원 이름: "+ member.getUsername());
//    }
//
////    //회원과 팀 함께 출력
////    private static void printUserAndTeam(Long memberId) {
////        Member member = em.find(Member.class, memberId);
////        Team team = member.getTeam();
////        System.out.println("회원 이름 : "+ member.getUsername());
////        System.out.println("소속팀 : "+ team.getName());
////    }
//
//
//}
