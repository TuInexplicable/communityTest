package com.icss.hotel.dao;

import com.icss.hotel.domain.Customer;
import com.icss.hotel.domain.Order;
import com.icss.hotel.domain.Order_Cus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public interface OrderMapper {

    /**
     * 查询显示所有的ostate=0的订单简略信息
     * @return ono,startTime,cname
     */
    List<Order_Cus> selectAllOrder();

    /**
     * 查询订单详细信息
     * @param ono
     * @return Order_Cus
     */
    Order_Cus selectOrderDetail(Integer ono);

    /**
     * 查询所有ostate=1的入住状态的订单
     * @return Map
     */
    List<Map> selectAllOrder_1();

    /**
     * 通过cname查询退房信息
     * @param cname
     * @return Map
     */
    List<Map> selectOrderByName_1(String cname);
    /**
     *添加新的订单update,顾客第一次入住，没有cno
     * 要先增加新顾客，然后通过idcard,查询到cno,
     * @param :Order.idcard
     * @return integer
     */

    Integer addOrder(Order order);

    /**
     * 退房
     * @param ono
     * @return
     */
    Integer optionOrder(@Param("ono") Integer ono, @Param("endTime") String endtime);
    /**
     * 删除订单信息
     * @param
     * @return
     */
    Integer deleteOrder(Integer ono);
}