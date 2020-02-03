package com.icss.hotel.service;

import com.icss.hotel.domain.Customer;
import com.icss.hotel.domain.Order;
import com.icss.hotel.domain.Order_Cus;

import java.util.List;
import java.util.Map;

public interface OrderService {

    List<Order_Cus> selectAllOrder();
    Order_Cus selectOrderDetail(Integer ono);
    List<Map> selectAllOrder_1();
    List<Map> selectOrderByName_1(String cname);
    Integer addOrder(Order order);
    Integer addCustomer(Customer customer);
    Integer optionOrder(Integer ono,String endtime);

    Integer updateIntegralByCno(Integer cno, Double intgral);
    int deleteOrder(Integer ono);
}
