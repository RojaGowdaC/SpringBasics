package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class Employee {
    public void init(){
        System.out.println("Employee Init");
    }

    @Value("${name}")
    String name;
    @Value("${age}")
    int age;
    @Value("${salary}")
    int salary;
    @Value("${taskList}")
    List<String> taskList;

    @Autowired
    private Department department;

    public Employee(Department department) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTaskList(List<String> taskList)
    {
        this.taskList=taskList;
    }
    public void setDepartment(Department department)
    {
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department + ", List: "+taskList+
                '}';
    }

    public void destroy(){
        System.out.println("Employee Destroy");
    }

}