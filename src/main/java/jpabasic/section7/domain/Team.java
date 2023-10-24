//package jpabasic.section7.domain;//package jpabasic.section6.domain;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Team extends BaseEntity{
//    @Id @GeneratedValue
//    @Column(name="TEAM_ID")
//    private Long id;
//    private String name;
//
////    //다대일 양방향
////    @OneToMany(mappedBy = "team")
////    private List<Member> members = new ArrayList<>();
//
//    /*
//    일대다 단방향
//        일(1)이 연관관계 주인
//        @JoinColumn 꼭 사용해야함. 그렇지 않으면 조인테이블 방식 사용(중간에 테이블 하나 추가함)
//        단점
//        엔티티가 관리하는 외래키가 다른 테이블에 있음
//        연관관계 관리를 위해 추가로 UPDATE SQL 실행
//    */
//    @OneToMany
//    @JoinColumn(name="TEAM_ID")
//    private List<Member> members = new ArrayList<>();
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Member> getMembers() {
//        return members;
//    }
//
//    public void setMembers(List<Member> members) {
//        this.members = members;
//    }
//}
