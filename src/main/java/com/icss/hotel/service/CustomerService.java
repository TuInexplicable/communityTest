package com.icss.hotel.service;

import com.icss.hotel.domain.Customer;

import java.util.List;

public interface CustomerService {
   List<Customer> selectAllCustomer();
   Customer selectCusByIdCard(String idcard);
}
