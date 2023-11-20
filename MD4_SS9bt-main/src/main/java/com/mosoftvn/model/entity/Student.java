package com.mosoftvn.model.entity;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Date birthday;
    private Integer classId;

    public Student() {
    }

    public Student(Integer id, String name, Date birthday, Integer classId) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
