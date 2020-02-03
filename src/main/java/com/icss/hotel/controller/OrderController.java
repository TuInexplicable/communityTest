package com.icss.hotel.controller;

import com.icss.hotel.domain.Customer;
import com.icss.hotel.domain.Order;
import com.icss.hotel.domain.Order_Cus;
import com.icss.hotel.service.CustomerService;
import com.icss.hotel.service.OrderService;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {
    @Resource
    private OrderService orderService;
    @Resource
    private CustomerService customerService;
    @Resource
    private RoomService roomService;


    @ResponseBody
    @RequestMapping("/selectAllOrder.action")
    public Map<String,Object> selectAllOrder() {
        resultMap.clear();
        List list = orderService.selectAllOrder();
        if (!list.isEmpty()) {
            resultMap.put("list", list);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
        } else if (list.size() == 0) {
            resultMap.put("code", 202);
            resultMap.put("msg", "无数据");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "出错了");
        }
    return resultMap;
    }

    @ResponseBody
    @RequestMapping("/selectOrderDetail.action")
    public Map<String,Object> selectOrderDetail(Integer ono) {
        resultMap.clear();
        Order_Cus order_cus = orderService.selectOrderDetail(ono);
        if (order_cus==null) {
            resultMap.put("code", 201);
            resultMap.put("msg", "出错了");
        } else {
            resultMap.put("list", order_cus);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/selectAllOrder_1.action")
    public Map<String,Object> selectAllOrder_1() {
        resultMap.clear();
        List list = orderService.selectAllOrder_1();
        if (list.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "无数据");
        } else {
            resultMap.put("list", list);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/selectOrderByName_1.action")
    public Map<String,Object> selectOrderByName_1(String cname) {
        resultMap.clear();
        List outlist = orderService.selectOrderByName_1(cname);
        if (outlist.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "无数据");
        }else {
            resultMap.put("list", outlist);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询订单成功");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/addOrder.action")
    public Map<String,Object> addOrder(Order order) {
        resultMap.clear();
        Integer result = orderService.addOrder(order);
        Integer result1 = roomService.updataRoomState(order.getRno(),1);
        if (result<0) {
            resultMap.put("code", 202);
            resultMap.put("msg", "出错了");
        }else {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加成功");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/addCus_Order.action")
    public Map<String,Object> addCus_Order(Customer cus, Order order) {
        resultMap.clear();
        Integer resultCus = orderService.addCustomer(cus);
        Integer cno = customerService.selectCusByIdCard(cus.getIdcard()).getCno();
        Integer result1 = roomService.updataRoomState(order.getRno(),1);
        order.setCno(cno);
        Integer resultOrder = orderService.addOrder(order);
        if (resultOrder<0&&resultCus<0&&result1<0) {
            resultMap.put("code", 202);
            resultMap.put("msg", "出错了");
        }else {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加成功");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping(value = "/outOrder.action", method = RequestMethod.POST)

    public Map<String,Object> optionOrder(Integer ono,Integer cno,Double integral,Integer rno,String endtime) {

        resultMap.clear();
        Integer result = orderService.optionOrder(ono,endtime);
        Integer result1 = orderService.updateIntegralByCno(cno,integral);
        Integer result0 = roomService.updataRoomState(rno,0);
        if (result<0&&result1<0&&result0<0) {
            resultMap.put("code", 202);
            resultMap.put("msg", "出错了");
        }else {
            resultMap.put("code", 200);
            resultMap.put("msg", "退房成功");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/deleteOrder.action")
    public Map<String,Object> deleteOrder(Integer ono){
        resultMap.clear();
        Integer result = orderService.deleteOrder(ono);
        if(result>0){
            resultMap.put("code",200);
            resultMap.put("msg","删除订单成功");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }
}
