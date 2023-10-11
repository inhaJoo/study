//package jpabasic.section6.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Locker {
//    @Id @GeneratedValue
//    @Column(name="LOCKER_ID")
//    private Long id;
//    private String name;
//
//    //일대일 양방향
//    @OneToOne(mappedBy = "locker")
//    private Member member;
//}
