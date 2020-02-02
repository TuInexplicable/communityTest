package com.icss.hotel.dao;

import com.icss.hotel.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {

    /**
     * 登录功能
     * @param account 用户输入的账号
     * @return
     */
    Emp logon(@Param("account") String account);

    /**
     * 查看所有员工
     * @return
     */
    List<Emp> selectAllEmp();

    /**
     * 添加员工
     * @param emp
     * @return
     */
    int addEmp(Emp emp);


    /**
     * 查看信息
     * @param
     * @param empno
     * @return
     */
    Emp selectEmp(@Param("empno") Integer empno);

    /**
     * 更新信息
     * @param ename,birth,account,phone
     * @return
     */
    int updateEmp(@Param("ename") String ename,@Param("birth") String birth,@Param("account") String account, @Param("phone") String phone,@Param("empno") Integer empno);

    /**
     * 修改密码
     * @param newPassword,empno
     * @return
     */
    Integer updatePassword(@Param("password") String newPassword,@Param("empno") Integer empno);
}