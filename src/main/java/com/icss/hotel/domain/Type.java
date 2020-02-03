package com.icss.hotel.domain;

import java.io.Serializable;

public class Type  implements Serializable {
    private Integer tno;

    private String tname;

    private Double price;

    public Type() {
    }

    public Type(Integer tno, String tname, Double price) {
        this.tno = tno;
        this.tname = tname;
        this.price = price;
    }

    public Type(String tname, Double price) {
        this.tname = tname;
        this.price = price;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", price=" + price +
                '}';
    }
}