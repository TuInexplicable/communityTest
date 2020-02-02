package com.icss.hotel.controller;
import com.icss.hotel.domain.Room;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/room")
public class RoomController  extends BaseController {
    @Resource
    private RoomService roomService;

    @ResponseBody
    @RequestMapping("/queryAllRoom.action")
    public Map<String, Object> queryAllRoom() {
        resultMap.clear();
        List list = roomService.queryAllRoom();
        if (list.size() > 0) {
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
            resultMap.put("roomList", list);
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "没有相关信息");
        }
        return resultMap;
    }

    @ResponseBody
    @RequestMapping("/addRoom.action")
    public Map<String, Object> addRoom(Room room) {
        resultMap.clear();
        int result = roomService.addRoom(room);
        if (result != -1) {
            resultMap.put("code", 200);
            resultMap.put("msg", "添加房间成功");
        } else {
            resultMap.put("code", 201);
            resultMap.put("msg", "添加房间失败");
        }
        return resultMap;
    }
    @ResponseBody
    @RequestMapping("/selectAllRoom_0.action")
    public Map<String,Object> selectAllRoom_0() {
        resultMap.clear();
        List outlist = roomService.selectAllRoom_0();
        if (outlist.isEmpty()) {
            resultMap.put("code", 201);
            resultMap.put("msg", "无数据");
        }else {
            resultMap.put("list", outlist);
            resultMap.put("code", 200);
            resultMap.put("msg", "查询成功");
        }
        return resultMap;
    }

}

