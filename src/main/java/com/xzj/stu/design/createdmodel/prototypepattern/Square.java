package com.xzj.stu.design.createdmodel.prototypepattern;

/**
 * @author zhijunxie
 * @date 2019/3/18
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
