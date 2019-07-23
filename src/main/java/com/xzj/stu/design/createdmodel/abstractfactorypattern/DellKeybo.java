package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete product A1
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class DellKeybo implements Keybo {
    @Override
    public void tap() {
        System.out.println("dell keybo tap the key");
    }
}
