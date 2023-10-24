//package jpabasic.section7.domain;//package jpabasic.section6.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//
//@Entity
//public class Member extends BaseEntity{
//    @Id @GeneratedValue
//    @Column(name="MEMBER_ID")
//    private Long id;
//
////    //다대일 단방향
////    @ManyToOne
////    @JoinColumn(name="TEAM_ID")
////    private Team team;
//
////    //일대다 양방향
////    @ManyToOne
////    @JoinColumn(name="TEAM_ID", insertable = false, updatable = false)//읽기 전용
////    private Team team;
//
//    /*
//        일대일
//    */
//    @OneToOne
//    @JoinColumn(name="LOCKER_ID")
//    private Locker locker;
//
////    //다대다
////    @ManyToMany
////    @JoinTable(name="MEMBER_PRODUCT")
////    private List<Product> products = new ArrayList<>();
//
//    private String username;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
////    public Team getTeam() {
////        return team;
////    }
////
////    public void setTeam(Team team) {
////        this.team = team;
////    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//}
