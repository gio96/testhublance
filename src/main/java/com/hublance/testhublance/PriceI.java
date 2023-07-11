package com.hublance.testhublance;

import com.hublance.testhublance.models.Price;

public interface PriceI {

    Price getFinalPrice(String date,Integer productId, Long brandId);
}
