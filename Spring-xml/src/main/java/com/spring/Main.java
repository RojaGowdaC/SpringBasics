package com.spring;
import com.spring.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee empobj= (Employee)appContext.getBean("emp");
        System.out.println(empobj);
    }
}