package com.icss.hotel.service;

import com.icss.hotel.domain.Type;

import java.util.List;

public interface TypeService {
    List<Type> queryAllType();

    int addType(Type type);

    Type selectType(Integer tno);

    Integer updateType(String tname, String price, Integer tno);

    int deleteType(Integer tno);
}
