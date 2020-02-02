package com.icss.hotel.service.impl;

import com.icss.hotel.dao.TypeMapper;
import com.icss.hotel.domain.Type;
import com.icss.hotel.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryAllType() {
        return typeMapper.queryAllType();
    }

    @Override
    public int addType(Type type) {
        return typeMapper.addType(type);
    }

    @Override
    public Type selectType(Integer tno){return typeMapper.selectType(tno);}

    @Override
    public Integer updateType(String tname, String price, Integer tno) {
        return typeMapper.updateType(tname,price,tno);
    }

    @Override
    public int deleteType(Integer tno) {
        return typeMapper.deleteType(tno);
    }

}
