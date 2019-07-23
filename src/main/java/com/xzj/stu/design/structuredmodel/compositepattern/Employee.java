package com.xzj.stu.design.structuredmodel.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模型类
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    // 下属
    private List<Employee> subordinates;

    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }
}
