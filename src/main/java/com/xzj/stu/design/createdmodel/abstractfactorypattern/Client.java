package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * @author zhijunxie
 * @date 2019/3/15
 */
public class Client {
    public static void main(String[] args) {
        PcFactory pcFactory = new DellPcFactory();
        Keybo keybo = pcFactory.createKeybo();
        Mouse mouse = pcFactory.createMouse();

        keybo.tap();
        mouse.move();
    }
}
