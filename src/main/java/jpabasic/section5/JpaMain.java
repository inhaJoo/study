//package jpabasic.section5;
//
//import jpabasic.section5.domain.Member;
//import jpabasic.section5.domain.Team;
//
//import javax.persistence.*;
//import java.util.List;
//
//public class JpaMain {
//    public static void main(String[] args){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        try{
//            Team team1 = new Team();
//            team1.setName("team1");
//            em.persist(team1);
//
//            Team team2 = new Team();
//            team2.setName("team2");
//            em.persist(team2);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setTeam(team1);
//
//            em.persist(member);
//
//            em.flush();//삭제
//            em.clear();//초기화
//
//            //단방향
//            Member findMember = em.find(Member.class, member.getId());
//            Team findTeam = findMember.getTeam();
//
//            System.out.println("team : "+findTeam.getName() + " / " + findTeam.getId());
//
////            Team newTeam = em.find(Team.class, team2.getId());
////            findMember.setTeam(newTeam);
//
//
//            //양방향
//            //List<Member> members = findMember.getTeam().getMembers();
//            Team findTeam2 = em.find(Team.class, team1.getId());
//            List<Member> memberList =  findTeam2.getMembers();
//
//            for(Member member1: memberList){
//                System.out.println(member1.getUsername() + " / "+ member1.getId());
//            }
//
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
