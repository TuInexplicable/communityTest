package com.icss.hotel.dao;

import com.icss.hotel.domain.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface RoomMapper {
    /**
     * 查询所有房子
     * @return
     */
    List<Map> queryAllRoom();

    /**
     * 添加房子类型
     * @param room
     * @return
     */
    int addRoom(Room room);

    /**
     * 办理入住，查询所有的rstate= 0 空闲的房子
     * @return
     */
    List<Map> selectAllRoom_0();

    /**
     * 刷新房子剩余数量,通过rno查找tno
     * @param state
     * @param rno
     * @return
     */

    Integer updataRoomState(@Param("rno") Integer rno,@Param("rstate") Integer state);

    /**
     * 按房间类型编号删除房间
     * @param tno
     * @return
     */

    Integer delRoomByTno(Integer tno);
}