package com.icss.hotel.service.impl;

import com.icss.hotel.dao.RoomMapper;
import com.icss.hotel.domain.Room;
import com.icss.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    private RoomMapper roomMapper;

    @Override
    public List<Map> queryAllRoom() {
        return roomMapper.queryAllRoom();
    }

    @Override
    public int addRoom(Room room) {
        return roomMapper.addRoom(room);
    }
    @Override
    public List<Map> selectAllRoom_0() {
        return roomMapper.selectAllRoom_0();
    }

    @Override
    public Integer delRoomByTno(Integer tno) {
        return roomMapper.delRoomByTno(tno);
    }

    @Override
    public Integer updataRoomState(Integer rno, Integer rstate) {
        return roomMapper.updataRoomState(rno, rstate);
    }


}

