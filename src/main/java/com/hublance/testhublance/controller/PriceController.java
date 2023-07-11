package com.hublance.testhublance.controller;

import com.hublance.testhublance.dto.PriceRequestDto;
import com.hublance.testhublance.dto.PriceResponseDto;
import com.hublance.testhublance.service.PriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public record PriceController(PriceService priceService) {

    @GetMapping("prices")
    public PriceResponseDto getFinalPrice(@RequestBody PriceRequestDto request) {
        return priceService.getFinalPrice(request.date(), request.productId(), request.brandId());
    }
}
