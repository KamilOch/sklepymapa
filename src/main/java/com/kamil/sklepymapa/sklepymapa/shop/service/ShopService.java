package com.kamil.sklepymapa.sklepymapa.shop.service;

import com.kamil.sklepymapa.sklepymapa.shop.Shop;
import com.kamil.sklepymapa.sklepymapa.shop.dto.ShopDTO;
import com.kamil.sklepymapa.sklepymapa.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopService {

    private final ShopRepository repository;

    @Autowired
    public ShopService(ShopRepository repository) {
        this.repository = repository;
    }

    public void addShop(ShopDTO shopDTO) {
        Shop newShop = Shop.builder()
                .name(shopDTO.getName())
                .streetName(shopDTO.getStreetName())
                .streetNumber(shopDTO.getStreetNumber())
                .build();

        repository.save(newShop);
    }

    public void deleteShop(long shopId) throws ChangeSetPersister.NotFoundException {

        Shop shopEntity = repository.findById(shopId).orElseThrow(ChangeSetPersister.NotFoundException::new);

        repository.delete(shopEntity);

    }

    public List<Shop> getAllSgops() {
        return repository.findAll();
    }
}
