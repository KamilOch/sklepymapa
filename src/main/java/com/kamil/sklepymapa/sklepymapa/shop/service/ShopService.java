package com.kamil.sklepymapa.sklepymapa.shop.service;

import com.kamil.sklepymapa.sklepymapa.shop.Shop;
import com.kamil.sklepymapa.sklepymapa.shop.dto.ShopDTO;
import com.kamil.sklepymapa.sklepymapa.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopService {

    private final ShopRepository repository;

    @Autowired
    public ShopService(ShopRepository repository) {
        this.repository = repository;
    }

public void addShop(ShopDTO shopDTO){
        Shop newShop = Shop.builder()
                .name(shopDTO.getName())
                .streetName(shopDTO.getStreetName())
                .streetNumber(shopDTO.getStreetNumber())
                .build();

        repository.save(newShop);
}

}
