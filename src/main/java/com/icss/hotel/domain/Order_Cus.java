package com.icss.hotel.domain;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public class Order_Cus {

    private Integer ono;

    private Integer cus_no;

    private Integer rno;

    private String starttime;

    private Double integral;

    private String endtime;

    private Integer ostate;

    private String cname;

    public Order_Cus() {
    }

    public Order_Cus(Integer ono, Integer cus_no, Integer rno, String starttime, Double integral, String endtime, Integer ostate, String cname) {
        this.ono = ono;
        this.cus_no = cus_no;
        this.rno = rno;
        this.starttime = starttime;
        this.integral = integral;
        this.endtime = endtime;
        this.ostate = ostate;
        this.cname = cname;
    }

    public Integer getOno() {
        return ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Integer getCus_no() {
        return cus_no;
    }

    public void setCus_no(Integer cus_no) {
        this.cus_no = cus_no;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public Double getIntegral() {
        return integral;
    }

    public void setIntegral(Double integral) {
        this.integral = integral;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
