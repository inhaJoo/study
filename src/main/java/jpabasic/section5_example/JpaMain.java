package jpabasic.section5_example;


import jpabasic.section5_example.domain.Item;
import jpabasic.section5_example.domain.Member;
import jpabasic.section5_example.domain.Order;
import jpabasic.section5_example.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class JpaMain {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{
            //멤버 객체 생성
            Member member1 = new Member();
            Member member2 = new Member();
            member1.setName("member1");
            member1.setCity("11");
            member1.setStreet("street1");
            member2.setName("member2");
            member2.setCity("22");
            member2.setStreet("street2");

            em.persist(member1);
            em.persist(member2);
            
            //주문 객체 생성
            Order order = new Order();
            order.setOrderDate(LocalDateTime.now());
            order.setMember(member2);

            em.persist(order);

            Order findOrder = em.find(Order.class, order.getId());
            Member members = findOrder.getMember();

            System.out.println("members.getName() : "+members.getName());
            System.out.println("findOrder.getMember().getName():"+findOrder.getMember().getName());
            
            //주문 물건 객체 생성
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderPrice(30000);
            orderItem.setOrder(order);

            em.persist(orderItem);

            //물건 객체 생성
            Item item = new Item();
            item.setName("물건1");
            item.setPrice(30000);

            em.persist(item);

            orderItem.setItem(item);

            OrderItem findOrderItem = em.find(OrderItem.class, orderItem.getId());

            System.out.println("결과값 : "+findOrderItem.getOrder().getMember().getName());
            System.out.println("날짜 :"+findOrderItem.getOrder().getOrderDate());
            System.out.println("물건이름, 물건값 : "+findOrderItem.getItem().getName()+" , "+findOrderItem.getItem().getPrice());

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
