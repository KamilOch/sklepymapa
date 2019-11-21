package com.kamil.sklepymapa.sklepymapa.shop.repository;

import com.kamil.sklepymapa.sklepymapa.shop.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "shops", collectionResourceRel = "shops")
public interface ShopRepository extends JpaRepository<Shop, Long>, QuerydslPredicateExecutor<Shop> {


}
