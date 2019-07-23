package com.xzj.stu.design.createdmodel.simplefactorypattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 运算类
 * @author zhijunxie
 * @date 2019/3/7
 */
@Setter
@Getter
public class Operation {
    private double numA;
    private double numB;

    public double getResult() {
        return 0;
    }
}
