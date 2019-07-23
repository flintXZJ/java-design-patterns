package com.xzj.stu.design.createdmodel.simplefactorypattern;

/**
 * 使用类
 * @author zhijunxie
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.makeOperation("*");
        operation.setNumA(20);
        operation.setNumB(30.56);

        System.out.println(operation.getResult());
    }
}
