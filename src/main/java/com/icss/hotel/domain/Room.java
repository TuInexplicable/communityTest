package com.icss.hotel.domain;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class Room implements Serializable {
    private Integer rno;

    private Integer tno;

    private Integer rstate;

    private String remark;

    public Room() {
    }
    public Room(Integer rno, Integer tno, Integer rstate, String remark) {
        this.rno = rno;
        this.tno = tno;
        this.rstate = rstate;
        this.remark = remark;
    }
    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}