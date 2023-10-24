//package jpabasic.section6_example.domain;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name="ORDERS")
//public class Order {
//    @Id @GeneratedValue
//    @Column(name="ORDER_ID")
//    private Long id;
//    @ManyToOne
//    @JoinColumn(name="MEMBER_ID")
//    private Member member;
//
//    @OneToMany(mappedBy = "order")
//    private List<OrderItem> orderItems = new ArrayList<>();
//
//    @OneToOne
//    @JoinColumn(name="DELIVERY_ID")
//    private Delivery delivery;
//    private LocalDateTime orderDate;
//    private OrderStatus status;
//}
