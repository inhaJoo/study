//package jpabasic.section8.domain;//package jpabasic.section7.domain;//package jpabasic.section6.domain;
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
//    //다대일 단방향
//    /*
//        프록시와 즉시로딩 주의
//        • 가급적 지연 로딩만 사용(특히 실무에서)
//        • 즉시 로딩 적용하면 예상하지 못한 SQL이 발생
//        • 즉시 로딩은 JPQL에서 N+1 문제를 일으킨다.
//        • @ManyToOne, @OneToOne은 기본이 즉시 로딩 -> LAZY로 설정
//        • @OneToMany, @ManyToMany는 기본이 지연 로딩
//    */
//    @ManyToOne(fetch = FetchType.LAZY)//LAZY, EAGER
//    @JoinColumn(name="TEAM_ID")
//    private Team team;
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
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//}
