package com.hublance.testhublance.service;

import com.hublance.testhublance.PriceI;
import com.hublance.testhublance.dto.PriceResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public record PriceService(PriceI priceI, ModelMapper modelMapper) {
    public PriceResponseDto getFinalPrice(String date, Integer productId, Long brandId) {
        return this.modelMapper.map(priceI.getFinalPrice(date, productId, brandId), PriceResponseDto.class);
    }
}
