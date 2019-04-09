package com.itsc30.student3.Domain;

import java.util.Date;

public class Student {
    private int sid;
    private String sname;
    private String ssex;
    private String sphone;
    private Date sbirthday;
    private String hobby;
    private String info;

    public Student(String sname, String ssex, String sphone, Date sbirthday, String hobby, String info) {
        super();
        this.sname = sname;
        this.ssex = ssex;
        this.sphone = sphone;
        this.sbirthday = sbirthday;
        this.hobby = hobby;
        this.info = info;
    }
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSsex() {
        return ssex;
    }
    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
    public String getSphone() {
        return sphone;
    }
    public void setSphone(String sphone) {
        this.sphone = sphone;
    }
    public Date getSbirthday() {
        return sbirthday;
    }
    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
