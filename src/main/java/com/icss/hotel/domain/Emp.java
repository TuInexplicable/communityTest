package com.icss.hotel.domain;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 文档注释
 * 员工类
 */

public class Emp implements Serializable {
    private Integer empno;

    private String ename;

    private String gender;

    private String birth;

    private String password;

    private String account;

    private String phone;

    private Integer state;

    private Integer roleid;

    public Emp() {
    }


    public Emp(Integer empno, String ename, String gender, String birth, String password, String account, String phone, Integer state, Integer roleid) {
        this.empno = empno;
        this.ename = ename;
        this.gender = gender;
        this.birth = birth;
        this.password = password;
        this.account = account;
        this.phone = phone;
        this.state = state;
        this.roleid = roleid;
    }


    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", birth='" + birth + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                ", state=" + state +
                ", roleid=" + roleid +
                '}';
    }
}