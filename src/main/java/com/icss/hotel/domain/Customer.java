package com.icss.hotel.domain;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;


public class Customer implements Serializable {
    private Integer cno;

    private String cname;

    private String gender;

    private String idcard;

    private String phone;

    private Double integral;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public Customer(Integer cno, String cname, String gender, String idcard, String phone, Double integral) {
        this.cno = cno;
        this.cname = cname;
        this.gender = gender;
        this.idcard = idcard;
        this.phone = phone;
        this.integral = integral;
    }

    public Customer() {
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Double getIntegral() {
        return integral;
    }

    public void setIntegral(Double integral) {
        this.integral = integral;
    }
}