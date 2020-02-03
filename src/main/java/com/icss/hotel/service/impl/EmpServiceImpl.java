package com.icss.hotel.service.impl;

import com.icss.hotel.dao.EmpMapper;
import com.icss.hotel.domain.Emp;
import com.icss.hotel.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public Emp logon(String account) {
        return empMapper.logon(account);
    }

    @Override
    public List<Emp> selectAllEmp(){return empMapper.selectAllEmp();}

    @Override
    public Emp selectEmp(Integer empno){return empMapper.selectEmp(empno);}

    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public int updateEmp(String ename, String birth, String account, String phone,Integer empno) {
        return empMapper.updateEmp(ename,birth,account,phone,empno);
    }

    @Override
    public Integer updatePassword( String newPassword, Integer empno) {
        return empMapper.updatePassword(newPassword,empno);
    }
}
