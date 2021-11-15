package com.cjss.restassured.model;

public class Student {

    private String rno;
    private String name;
    private String branch;

    public Student(String rno, String name, String branch) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
