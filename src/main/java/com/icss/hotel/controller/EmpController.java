package com.icss.hotel.controller;

import com.icss.hotel.domain.Emp;
import com.icss.hotel.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController extends BaseController{

    @Resource
    private EmpService empService;

    @PostMapping("/logon.action")
    @ResponseBody
    public Map<String,Object> logon(String account, String password){
        resultMap.clear();
        Emp emp = empService.logon(account);
        if (emp == null){
            resultMap.put("code",202);
            resultMap.put("msg","账号不存在");
        }else if(!emp.getPassword().equals(password)){
            resultMap.put("code",201);
            resultMap.put("msg","密码错误");
        }else{
            resultMap.put("code",200);
            resultMap.put("msg","登录成功");
            resultMap.put("emp",emp);
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/selectAllEmp.action")
    public Map<String,Object> selectAllEmp(){
        resultMap.clear();
        List list = empService.selectAllEmp();
        if(!list.isEmpty()){
            resultMap.put("list",list);
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
        }else if(list.isEmpty()){
            resultMap.put("code",202);
            resultMap.put("msg","无数据");
        }else{
            resultMap.put("code",201);
            resultMap.put("msg","查询错误");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/addEmp.action")
    public Map<String,Object> addEmp(Emp emp){
        Integer result = empService.addEmp(emp);
        if(result>0){
            resultMap.put("code",200);
            resultMap.put("msg","添加成功");
        }else if(result<=0){
            resultMap.put("code",201);
            resultMap.put("msg","插入失败");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/selectEmp.action")
    public Map<String,Object> selectEmp(String empno){
        resultMap.clear();
        Emp emp= empService.selectEmp(Integer.valueOf(empno));
        if(emp!=null){
            resultMap.put("emp",emp);
            resultMap.put("code",200);
            resultMap.put("msg","查询成功");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateEmp.action")
    public Map<String,Object> updateEmp(String ename,  String birth, String account, String phone,String empno){

        Integer result = empService.updateEmp(ename,birth,account,phone,Integer.valueOf(empno));
        if(result>0){
            resultMap.put("code",200);
            resultMap.put("msg","修改成功");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updatePassword.action")
    public Map<String,Object> updatePassword(String newPassword,String empno){
        Integer result = empService.updatePassword(newPassword,Integer.valueOf(empno));
        if(result>0){
            resultMap.put("code",200);
            resultMap.put("msg","修改密码成功");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }
}
