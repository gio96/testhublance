package com.hublance.testhublance.models;

public class Price {
    private long id;

    private BrandDao brandId;

    private String startDate;

    private String endDate;
    private Integer priceList;

    private Integer productId;

    private Integer priority;

    private Double price;

    private String curr;

    public Price() {
    }

    public Price(Double price, String curr) {
        this.price = price;
        this.curr = curr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BrandDao getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandDao brandDaoId) {
        this.brandId = brandDaoId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", brandId=" + brandId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priceList=" + priceList +
                ", productId=" + productId +
                ", priority=" + priority +
                ", price=" + price +
                ", curr='" + curr + '\'' +
                '}';
    }
}
