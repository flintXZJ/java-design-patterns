package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete product A2
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class HpKeybo implements Keybo {
    @Override
    public void tap() {
        System.out.println("hp keybo tap the key");
    }
}
