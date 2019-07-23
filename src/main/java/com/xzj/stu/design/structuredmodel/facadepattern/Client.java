package com.xzj.stu.design.structuredmodel.facadepattern;

/**
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        // 客户端调用现在更加清晰了
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
