package com.xzj.stu.design.createdmodel.prototypepattern;

/**
 * @author zhijunxie
 * @date 2019/3/18
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
