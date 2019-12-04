package com.kamil.sklepymapa.sklepymapa;

import com.kamil.sklepymapa.sklepymapa.shop.dto.ShopDTO;
import com.kamil.sklepymapa.sklepymapa.shop.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramController {

    private final ShopService shopService;
    private final ShopDTO shopDTO;

    public ProgramController(ShopService shopService, ShopDTO shopDTO) {
        this.shopService = shopService;
        this.shopDTO = shopDTO;
    }


    @RequestMapping("/dodajSklep")
    public String dodajSklep(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "streetName", required = false) String streetName,
            @RequestParam(value = "streetNumber", required = false) Integer streetNumber
    ) {
        if (name != null && streetName != null && streetNumber != null) {
            ShopDTO newShop = ShopDTO.builder().name(name).streetName(streetName).streetNumber(streetNumber).build();
            System.out.println(newShop.toString());
            shopService.addShop(newShop);
        }
        return "admin";
    }


    @GetMapping("/shops")
    public String shopList(
            Model model
    ) {
        model.addAttribute("sklep", shopService.getAllShops());
        return "user";
    }

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }
}
