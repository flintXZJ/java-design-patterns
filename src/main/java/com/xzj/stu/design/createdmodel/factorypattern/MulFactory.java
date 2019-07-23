package com.xzj.stu.design.createdmodel.factorypattern;

import com.xzj.stu.design.createdmodel.simplefactorypattern.Operation;
import com.xzj.stu.design.createdmodel.simplefactorypattern.OperationMul;

/**
 * @author zhijunxie
 * @date 2019/3/7
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
