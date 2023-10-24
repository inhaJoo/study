//package jpabasic.section9.domain;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
////@Entity
//public class Member {
//    @Id
//    @GeneratedValue
//    @Column(name="MEMBER_ID")
//    private Long id;
//    @Column(name="USERNAME")
//    private String userName;
//
//    //기간 Period
//    /*
//        • 새로운 값 타입을 직접 정의할 수 있음
//        • JPA는 임베디드 타입(embedded type)이라 함
//        • 주로 기본 값 타입을 모아서 만들어서 복합 값 타입이라고도 함
//        • int, String과 같은 값 타입
//
//    */
//    @Embedded
//    private Period workPeriod;
//
//    //주소 Address
//    @Embedded//값 타입
//    private Address homeAddress;
//
//    @ElementCollection
//    @CollectionTable(name="FAVORITE_FOOD", joinColumns = @JoinColumn(name="MEMBER_ID"))
//    @Column(name="FOOD_NAME")
//    private Set<String> favoriteFoods = new HashSet<>();
////    @ElementCollection
////    @CollectionTable(name="ADDRESS", joinColumns = @JoinColumn(name="MEMBER_ID"))
////    private List<Address> addressHistory = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "MEMBER_ID")
//    private List<AddressEntity> addressHistory = new ArrayList<>();
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="city",column = @Column(name="WORK_CITY")),
//            @AttributeOverride(name="street", column = @Column(name="WORK_STREET")),
//            @AttributeOverride(name="zipcode", column = @Column(name="WORK_ZIPCODE"))
//    })
//    private Address workAddress;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public Period getWorkPeriod() {
//        return workPeriod;
//    }
//
//    public void setWorkPeriod(Period workPeriod) {
//        this.workPeriod = workPeriod;
//    }
//
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Address getWorkAddress() {
//        return workAddress;
//    }
//
//    public void setWorkAddress(Address workAddress) {
//        this.workAddress = workAddress;
//    }
//
//    public Set<String> getFavoriteFoods() {
//        return favoriteFoods;
//    }
//
//    public void setFavoriteFoods(Set<String> favoriteFoods) {
//        this.favoriteFoods = favoriteFoods;
//    }
//
//    public List<Address> getAddressHistory() {
//        return addressHistory;
//    }
//
//    public void setAddressHistory(List<Address> addressHistory) {
//        this.addressHistory = addressHistory;
//    }
//}
