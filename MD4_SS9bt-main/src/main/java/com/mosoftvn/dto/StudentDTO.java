package com.mosoftvn.dto;

import java.sql.Date;

public class StudentDTO {
    private Integer id;
    private String name;
    private Date birthday;
    private Integer classId;

    private String className;

    public StudentDTO() {
    }

    public StudentDTO(Integer id, String name, Date birthday, Integer classId, String className) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classId = classId;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
