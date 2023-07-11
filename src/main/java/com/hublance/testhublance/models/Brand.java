package com.hublance.testhublance.models;

import java.util.List;

public class Brand {

    private long id;

    private String name;

    private List<PriceDao> price;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PriceDao> getPrice() {
        return price;
    }

    public void setPrice(List<PriceDao> price) {
        this.price = price;
    }
}
