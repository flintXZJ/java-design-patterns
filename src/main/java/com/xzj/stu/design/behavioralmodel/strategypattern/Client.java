package com.xzj.stu.design.behavioralmodel.strategypattern;

import com.xzj.stu.design.behavioralmodel.strategypattern.impl.BluePen;

/**
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new BluePen());
        context.executeDraw(10,0,0);
    }
}
