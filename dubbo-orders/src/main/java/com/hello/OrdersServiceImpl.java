package com.hello;

public class OrdersServiceImpl implements IOrdersService {
    public Orders query(Long orderId) {
        Orders orders=new Orders();
        orders.setPrice(1000);
        orders.setBuyName("悟空");
        orders.setAddr("上海");
        orders.setOrderId(1001);
        orders.setProductName("三星s10");
        return orders;
    }
}
