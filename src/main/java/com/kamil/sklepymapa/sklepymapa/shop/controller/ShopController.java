package com.kamil.sklepymapa.sklepymapa.shop.controller;

import com.kamil.sklepymapa.sklepymapa.shop.Shop;
import com.kamil.sklepymapa.sklepymapa.shop.dto.ShopDTO;
import com.kamil.sklepymapa.sklepymapa.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/custom/shops/delete/{shopId}")
    public void deleteShop (@RequestParam("shopId") int shopId ) throws ChangeSetPersister.NotFoundException {
        shopService.deleteShop(shopId);
    }

    @PostMapping("/custom/shops/all")
    public List<Shop> getAllShops (){
        return shopService.getAllSgops();
    }


}
