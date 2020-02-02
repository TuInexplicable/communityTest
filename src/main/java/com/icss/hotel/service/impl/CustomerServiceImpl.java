package com.icss.hotel.service.impl;

import com.icss.hotel.dao.CustomerMapper;
import com.icss.hotel.domain.Customer;
import com.icss.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> selectAllCustomer() {
        return customerMapper.selectAllCustomer();
    }

    @Override
    public Customer selectCusByIdCard(String idcard) {
        return customerMapper.selectCusByIdCard(idcard);
    }

}
