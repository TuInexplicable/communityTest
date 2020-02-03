package com.icss.hotel.service;

import com.icss.hotel.domain.Room;

import java.util.List;
import java.util.Map;

public interface RoomService {
    List<Map> queryAllRoom();
    int addRoom(Room room);
    List<Map> selectAllRoom_0();
    Integer delRoomByTno(Integer tno);
    Integer updataRoomState(Integer rno, Integer rstate);
}
