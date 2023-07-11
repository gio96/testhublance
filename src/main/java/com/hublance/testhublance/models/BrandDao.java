package com.hublance.testhublance.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BRAND")
public class BrandDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "brandId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PriceDao> price;

    public BrandDao() {
    }

    public BrandDao(String name) {
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
