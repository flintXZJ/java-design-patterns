package com.xzj.stu.design.structuredmodel.facadepattern.impl;

import com.xzj.stu.design.structuredmodel.facadepattern.Shape;

/**
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
