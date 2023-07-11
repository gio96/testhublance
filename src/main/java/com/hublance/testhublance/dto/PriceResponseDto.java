package com.hublance.testhublance.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceResponseDto {

    private Integer productId;
    private Long brandId;
    private Integer priceList;
    private String startDate;
    private String endDate;
    private Double price;
}
