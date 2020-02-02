package com.icss.hotel.controller;

import com.icss.hotel.domain.Customer;
import com.icss.hotel.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController{
    @Resource
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping("/selectAllCustomer.action")
    public Map<String,Object> selectAllCustomer(){
        resultMap.clear();
        List customerlist = customerService.selectAllCustomer();
        if(!customerlist.isEmpty()){
            resultMap.put("list",customerlist);
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
        }else if(customerlist.isEmpty()){
            resultMap.put("code",202);
            resultMap.put("msg","无数据");
        }else{
            resultMap.put("code",201);
            resultMap.put("msg","查询错误");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/selectCusByIdCard.action")
    public Map<String,Object> selectCusByIdCard(@Param("idcard")String idcard){
        resultMap.clear();
       Customer customer = customerService.selectCusByIdCard(idcard);
        if(!(customer==null)){
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
            resultMap.put("customer",customer);
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","无数据");
        }
        return resultMap;
    }
}
