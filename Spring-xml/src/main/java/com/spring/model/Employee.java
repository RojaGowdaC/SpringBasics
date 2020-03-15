package com.spring.model;

import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private List<String> taskList;

    Department department;

    public Employee(Department department) {
        this.department = department;

    }
    public void setTaskList(List<String> taskList)
    {
        this.taskList=taskList;
    }
   public void setName(String name) {
        this.name = name;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee details:" +
                "name=" + name  +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department+", List: "+taskList;
    }
}

