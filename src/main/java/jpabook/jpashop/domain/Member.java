package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id") // 그냥 냅두면 Entity에도 id로 들어가게 된다.
    private Long id;

    private String name;

    @Embedded // 내장 타입 (Embedded나 , Embeddable만 있으면 되는데 둘 다도 많이 해준다)
    private Address address;

    @OneToMany(mappedBy = "member") // Order 테이블에 있는 member 필드에 의해 매핑된다~
    private List<Order> orders = new ArrayList<>();
}
