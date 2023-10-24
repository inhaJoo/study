//package jpabasic.section9;
//
//import jpabasic.section9.domain.Address;
//import jpabasic.section9.domain.Member;
//import jpabasic.section9.domain.Period;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Set;
//
//public class JpaMain {
//    public static void main(String[] arg){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        try{
//            //값 타입 저장 예제
//            Member member = new Member();
//            member.setUserName("member1");
//            member.setHomeAddress(new Address("city1", "street", "1000"));
//
//            member.getFavoriteFoods().add("치킨");
//            member.getFavoriteFoods().add("족발");
//            member.getFavoriteFoods().add("피자");
//
//            member.getAddressHistory().add(new Address("old1", "street", "1000"));
//            member.getAddressHistory().add(new Address("old2", "street", "1000"));
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
//            // 값 타입 조회 예제
//            // 컬렉션은 지연로딩, 소속된 Embedded는 Entity 조회할때 같이 조회된다.
//            System.out.println("============== START =============");
//            Member findMember = em.find(Member.class, member.getId());
//
//            List<Address> addressHistory = findMember.getAddressHistory();
//            for(Address address : addressHistory) {
//                System.out.println("address = "+ address.getCity());
//            }
//
//            Set<String> favoriteFoods =  findMember.getFavoriteFoods();
//            for(String favoriteFood : favoriteFoods){
//                System.out.println("favoriteFood = "+ favoriteFood);
//            }
//
//            //값 타입 수정예제
//            //city -> newCity
//            Address a = findMember.getHomeAddress();
//            findMember.setHomeAddress(new Address("newCity", a.getStreet(), a.getZipcode()));
//
//            //치킨 -> 한식
//            //단순 String이기 때문에 통째로 갈아껴야함
////            findMember.getFavoriteFoods().remove("치킨");
////            findMember.getFavoriteFoods().add("한식");
//            /*
//               주소 바꾸기
//               equals
//             • 값 타입 컬렉션에 변경 사항이 발생하면, 주인 엔티티와 연관된 모든 데이터를 삭제하고, 값 타입 컬렉션에 있는 현재 값을 모두 다시 저장한다.
//            */
//
//
//            findMember.getAddressHistory().remove(new Address("old1", "street", "1000"));
//            findMember.getAddressHistory().add(new Address("newCity1", "street", "1000"));
//
//
//              //값 타입 예제
////            Address workADD = new Address("서울특별시 성동구", "상원12길 34", "908-909호");
////            Address homeADD = new Address("서울특별시 성동구", "뚝섬", "4번출구");
////            Period period = new Period(LocalDateTime.now(), LocalDateTime.now());
////            Member member = new Member();
////            member.setUserName("member1");
////            member.setHomeAddress(homeADD);
////            member.setWorkAddress(workADD);
////            member.setWorkPeriod(period);
////            em.persist(member);
////
////            Address newWorkADD = new Address("서울특별시 강남구", workADD.getStreet(), workADD.getZipcode());
////            Period period2 = new Period(period.getStartDate(), period.getEndDate());
////            Member member2 = new Member();
////            member2.setUserName("member2");
////            member2.setHomeAddress(newWorkADD);
////            member2.setWorkAddress(workADD);
////            member2.setWorkPeriod(period2);
////            em.persist(member2);
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
