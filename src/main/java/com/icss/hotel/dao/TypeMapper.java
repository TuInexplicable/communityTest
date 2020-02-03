package com.icss.hotel.dao;

import com.icss.hotel.domain.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface TypeMapper {

    List<Type> queryAllType();

    /**
     * 添加客房类型
     * @param type
     * @return
     */
    int addType(Type type);

    /**
     * 查看客房类型信息
     * @param
     * @param tno
     * @return
     */
    Type selectType(Integer tno);

    /**
     * 更新客房类型信息
     * @param
     * @return
     */
    Integer updateType(@Param("tname") String tname,@Param("price") String price,@Param("tno") Integer tno);

    /**
     * 删除客房类型信息
     * @param
     * @return
     */
    Integer deleteType(Integer tno);
}