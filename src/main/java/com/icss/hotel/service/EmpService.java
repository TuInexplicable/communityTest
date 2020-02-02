package com.icss.hotel.service;

import com.icss.hotel.domain.Emp;

import java.util.List;

public interface EmpService {
    Emp logon(String account);
    List<Emp> selectAllEmp();
    Emp selectEmp(Integer empno);
    int addEmp(Emp emp);
    int updateEmp(String ename,  String birth, String account, String phone, Integer empno);
    Integer updatePassword(String newPassword, Integer empno);
}
