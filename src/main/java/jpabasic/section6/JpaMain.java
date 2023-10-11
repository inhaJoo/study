//package jpabasic.section6;
//
//import jpabasic.section6.domain.Member;
//import jpabasic.section6.domain.Team;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class JpaMain {
//    public static void main(String[] args){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        try {
//            Member member = new Member();
//            member.setUsername("member1");
//
//            em.persist(member);
//
//            Team team = new Team();
//            team.setName("teamA");
//            //member 테이블에 update 한번 더 진행해야함
//            team.getMembers().add(member);
//
//            em.persist(team);
//
//            tx.commit();
//        }catch(Exception e){
//            tx.rollback();
//        }finally{
//            em.close();
//        }
//
//        emf.close();
//    }
//}
