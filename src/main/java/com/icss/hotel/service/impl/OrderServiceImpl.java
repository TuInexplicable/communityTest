package com.icss.hotel.service.impl;

import com.icss.hotel.dao.CustomerMapper;
import com.icss.hotel.dao.OrderMapper;
import com.icss.hotel.domain.Customer;
import com.icss.hotel.domain.Order;
import com.icss.hotel.domain.Order_Cus;
import com.icss.hotel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private CustomerMapper customerMapper;
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order_Cus> selectAllOrder() {
        return orderMapper.selectAllOrder();
    }

    @Override
    public Order_Cus selectOrderDetail(Integer ono) {
        return orderMapper.selectOrderDetail(ono);
    }

    @Override
    public List<Map> selectAllOrder_1() {
        return orderMapper.selectAllOrder_1();
    }

    @Override
    public List<Map> selectOrderByName_1(String cname) {
        return orderMapper.selectOrderByName_1(cname);
    }

    @Override
    public Integer addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public Integer addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }
    @Override
    public Integer optionOrder(Integer ono ,String endtime) {
        return orderMapper.optionOrder(ono,endtime);
    }
    @Override
    public Integer updateIntegralByCno(Integer cno, Double intgral) {
        return customerMapper.updateIntegralByCno(cno,intgral);
    }
    @Override
    public int deleteOrder(Integer ono) {
        return orderMapper.deleteOrder(ono);
    }
}
