package com.hublance.testhublance.repository;

import com.hublance.testhublance.models.PriceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PriceRepositoryDataAdapter extends JpaRepository<PriceDao, Long> {

    @Query(value = "SELECT * FROM PRICES where product_id=:productId and brand_id=:brandId and :fecha between start_date and end_date and priority = (select max(priority) from PRICES where :fecha between start_date and end_date)",
            nativeQuery = true)
    PriceDao getFinalPrice(@Param("fecha") String fecha, @Param("productId") Integer productId, @Param("brandId") Long brandId);
}
