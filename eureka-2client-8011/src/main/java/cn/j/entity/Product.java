package cn.j.entity;

import java.math.BigDecimal;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
    @Id
    private Integer id;

    private Integer businessId;

    private BigDecimal price;

    private Integer num;

    private String detail;
}