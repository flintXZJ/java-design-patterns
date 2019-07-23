package com.xzj.stu.design.createdmodel.simplefactorypattern;

/**
 * @author zhijunxie
 * @date 2019/3/7
 */
public class OperationSub extends Operation{
    @Override
    public double getResult() {
        return super.getNumA() - super.getNumB();
    }
}
