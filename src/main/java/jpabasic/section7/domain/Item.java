//package jpabasic.section7.domain;
//
//import javax.persistence.*;
//
//@Entity
///*
//     JOINED             조인
//     장점
//     -테이블 정규화, 외래키 참조 무결성 조건 사용가능, 저장공간 효율화
//     단점
//     -조회시 조인 多 성능저하, 조회 쿼리 복잡, 데이터 저장시 insert 쿼리 2번 호출
//
//     SINGLE_TABLE       단일 테이블
//     장점
//     -조인 필요없으므로 조회 성능 빠름, 조회 쿼리 단순
//     단점
//     -자식 엔티티 맵핑 칼럼 모두 null 허용
//     -단일 테이블에 모든 것 저장하므로 테이블 커질 수 있음. 상황에 따라 조회 성능이 오히려 느려질 수 있음.
//
//     TABLE_PER_CLASS    구현 클래스마다 테이블 전략
//     -추천x
//     장점
//     -서브 타입 명확하게 구분해서 처리할 때 효과적, not null 제약조건 사용 가능
//     단점
//     -여러 자식 테이블 함께 조회시 성능 느림(UNION), 자식 테이블 통합 쿼리 어려움
//*/
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "DIS_TYPE")    // DTYPE, 단일테이블 전략에는 없어도 생김
//public abstract class Item {
//    @Id @GeneratedValue
//    @Column(name="ITEM_ID")
//    private Long id;
//    private String name;
//    private int price;
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
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}
