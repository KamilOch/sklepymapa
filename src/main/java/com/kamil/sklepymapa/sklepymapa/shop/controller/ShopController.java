package com.kamil.sklepymapa.sklepymapa.shop.controller;

import com.kamil.sklepymapa.sklepymapa.shop.dto.ShopDTO;
import com.kamil.sklepymapa.sklepymapa.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @PostMapping("/custom/shops/add")
    public void addShop(
            @RequestBody ShopDTO shopDTO
    ) {
        shopService.addShop(shopDTO);
    }
}
