//package jpabasic.section6_example.domain;
//
//import javax.persistence.*;
//
//@Entity
//public class Delivery {
//    @Id @GeneratedValue
//    @Column(name="DELEVERY_ID")
//    private Long id;
//    @OneToOne(mappedBy = "delivery")
//    private Order order;
//    private String city;
//    private String street;
//    private String zipcode;
//    private DeliveryStatus status;
//}
