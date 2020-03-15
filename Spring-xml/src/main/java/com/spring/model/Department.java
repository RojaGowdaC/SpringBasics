package com.spring.model;

import java.util.Date;

public class Department {
    private String departmentName;
    private Date createdOn;

    public void setDept(String dept) {
        this.departmentName = dept;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
