package com.xzj.stu.design.createdmodel.factorypattern;

import com.xzj.stu.design.createdmodel.simplefactorypattern.Operation;

/**
 * 使用类
 * @author zhijunxie
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        IFactory addFactory = new AddFactory();
        Operation operation = addFactory.createOperation();
        operation.setNumA(20);
        operation.setNumB(30);
        System.out.println(operation.getResult());
    }
}
