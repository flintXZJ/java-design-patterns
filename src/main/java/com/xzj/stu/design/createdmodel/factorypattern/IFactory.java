package com.xzj.stu.design.createdmodel.factorypattern;

import com.xzj.stu.design.createdmodel.simplefactorypattern.Operation;

/**
 * @author zhijunxie
 * @date 2019/3/7
 */
public interface IFactory {
    Operation createOperation();
}
