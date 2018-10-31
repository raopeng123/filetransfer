package com.example;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BASIC_GOOD_INFO")
@Data
public class GoodInfoEntity  {
    /**
     * 商品编号
     */
    @Id
    @GeneratedValue
    @Column(name = "BGI_ID")
    private Long id;
    /**
     * 商品名称
     */
    @Column(name = "BGI_NAME")
    private String name;
    /**
     * 商品单位
     */
    @Column(name = "BGI_UNIT")
    private String unit;
    /**
     * 商品单价
     */
    @Column(name = "BGI_PRICE")
    private BigDecimal price;
}
