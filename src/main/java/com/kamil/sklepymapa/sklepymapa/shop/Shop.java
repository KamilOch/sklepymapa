package com.kamil.sklepymapa.sklepymapa.shop;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@SequenceGenerator(name = "SHOP_SEQ", sequenceName = "shop_id_seq", allocationSize = 1)
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHOP_SEQ")
    @Column (name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_number")
    private int streetNumber;
}
