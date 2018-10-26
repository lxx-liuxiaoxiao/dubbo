package com.hello;

public class Orders {
    private Integer orderId;
    private String buyName;
    private String productName;
    private Integer price;
    private String addr;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", buyName='" + buyName + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", addr='" + addr + '\'' +
                '}';
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getBuyName() {
        return buyName;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getPrice() {
        return price;
    }

    public String getAddr() {
        return addr;
    }
}
