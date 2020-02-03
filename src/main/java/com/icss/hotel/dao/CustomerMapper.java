package com.icss.hotel.dao;

import com.icss.hotel.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CustomerMapper {
    /**
     * 查询所有顾客信息
     * @return
     */
    List<Customer> selectAllCustomer();

    /**
     * 添加订单，输入顾客信息，通过idcard查询顾客是否曾经入住过
     * @param idcard
     * @return Custom
     */
    Customer selectCusByIdCard(String idcard);
    /**
     * 添加新顾客
     */
    Integer addCustomer(Customer customer);

    Integer updateIntegralByCno(@Param("cno") Integer cno,@Param("integral") Double intgral);
}