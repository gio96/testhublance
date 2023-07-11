package com.hublance.testhublance.adapter;

import com.hublance.testhublance.PriceI;
import com.hublance.testhublance.repository.PriceRepositoryDataAdapter;
import com.hublance.testhublance.models.Price;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PriceImpl implements PriceI {

    private final PriceRepositoryDataAdapter priceRepositoryDataAdapter;
    private final ModelMapper modelMapper;

    public PriceImpl(PriceRepositoryDataAdapter priceRepositoryDataAdapter, ModelMapper modelMapper) {
        this.priceRepositoryDataAdapter = priceRepositoryDataAdapter;
        this.modelMapper = modelMapper;
    }

    @Override
    public Price getFinalPrice(String date, Integer productId, Long brandId) {
        return this.modelMapper.map(priceRepositoryDataAdapter.getFinalPrice(date, productId, brandId), Price.class);
    }
}
