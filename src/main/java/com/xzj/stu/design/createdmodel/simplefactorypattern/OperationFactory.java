package com.xzj.stu.design.createdmodel.simplefactorypattern;

/**
 * 简单工厂类
 * @author zhijunxie
 * @date 2019/3/7
 */
public class OperationFactory {
    public static Operation makeOperation(String type) {
        Operation operation = null;
        switch (type) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                operation = new Operation();
        }
        return operation;
    }
}
