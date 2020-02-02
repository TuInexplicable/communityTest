package com.icss.hotel.controller;

import com.icss.hotel.domain.Emp;
import com.icss.hotel.domain.Type;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/type")
public class TypeController extends BaseController {

    @Resource
    private TypeService typeService;
    @Resource
    private RoomService roomService;

    @ResponseBody
    @RequestMapping("/queryAllType.action")
    public Map<String, Object> queryAllType() {
        resultMap.clear();
        List<Type> list = typeService.queryAllType();
        if (list.size() > 0) {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("type", list);
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有相关类型信息");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/selectType.action")
    public Map<String, Object> selectType(String tno) {
        resultMap.clear();
        Type type= typeService.selectType(Integer.valueOf(tno));
        if (type!=null) {
            resultMap.put("type",type);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有相关类型信息");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/addType.action")
    public Map<String, Object> addType(Type type) {
        resultMap.clear();
        int result = typeService.addType(type);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加房间类型成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "添加房间类型失败");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/updateType.action")
    public Map<String,Object> updateType(String tname,  String price, String tno){
        resultMap.clear();
        Integer result = typeService.updateType(tname,price,Integer.valueOf(tno));
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
    @RequestMapping("/deleteType.action")
    public Map<String,Object> deleteType(Integer tno){
        resultMap.clear();
        Integer result = typeService.deleteType(tno);
        Integer result1 = roomService.delRoomByTno(tno);
        if(result>0&& result1>0){
            resultMap.put("code",200);
            resultMap.put("msg","删除成功");
        }else{
            resultMap.put("code",202);
            resultMap.put("msg","出错了");
        }
        return resultMap;
    }
}
