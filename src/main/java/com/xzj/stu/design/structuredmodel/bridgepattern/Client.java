package com.xzj.stu.design.structuredmodel.bridgepattern;

import com.xzj.stu.design.structuredmodel.bridgepattern.impl.GreenPen;
import com.xzj.stu.design.structuredmodel.bridgepattern.impl.RedPen;
import com.xzj.stu.design.structuredmodel.bridgepattern.sub.Circle;
import com.xzj.stu.design.structuredmodel.bridgepattern.sub.Rectangle;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(10, new GreenPen());
        Shape rectangle = new Rectangle(4, 8, new RedPen());

        circle.draw();
        rectangle.draw();
    }
}
