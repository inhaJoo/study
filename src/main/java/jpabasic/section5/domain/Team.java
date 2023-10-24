package jpabasic.section5.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Team {
    @Id @GeneratedValue
    @Column(name="TEAM_ID")
    private Long id;
    private String name;

    /*
        mappedBy
        다대일에서 업데이트시 업데이트 되는 테이블이 달라지므로 읽기만 해라.
        ex) 자동차랑 자동차바퀴 중에 자동차바퀴를 주인으로 잡고 관리해야한다.
    */
    @OneToMany(mappedBy = "team")//읽기만 가능
    private List<Member> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
    
//    //Team에 Member 연결도 가능
//    public void addMember(Member member) {
//        member.setTeam(this);
//        members.add(member);
//    }
}
