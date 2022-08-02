package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype") // 싱글테이블이기 때문에 db에 저장될 때 구분을 해주기 위한 어노테이션 -> dtype으로 어떤 객체인지 구분한다.
@Getter @Setter
public abstract class Item { // 추상 클래스로 만든다 -> 구현체를 가지고 할 것이기 때문에

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}
