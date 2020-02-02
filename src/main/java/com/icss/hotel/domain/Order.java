package com.icss.hotel.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;


public class Order implements Serializable {
    private Integer ono;

    private Integer cno;

    private Integer rno;

    private String starttime;

    private String endtime;

    private Integer ostate;

    private Integer empno;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }



    public Order() {
    }

    public Order(Integer ono, Integer cno, Integer rno, String starttime, String endtime, Integer ostate,Integer empno) {
        this.ono = ono;
        this.cno = cno;
        this.rno = rno;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ostate = ostate;
        this.empno = empno;
    }
    public Integer getOno() {
        return ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
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
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

}