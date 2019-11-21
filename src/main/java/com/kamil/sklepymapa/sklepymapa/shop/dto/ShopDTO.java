package com.kamil.sklepymapa.sklepymapa.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShopDTO {

    private String name;
    private String streetName;
    private int streetNumber;
}
