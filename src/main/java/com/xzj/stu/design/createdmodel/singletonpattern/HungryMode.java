package com.xzj.stu.design.createdmodel.singletonpattern;

/**
 * 饿汉式
 * 没有加锁，执行效率会提高
 * 类加载时就初始化，浪费内存
 *
 * @author zhijunxie
 * @date 2019/3/14
 */
public class HungryMode {

    /**
     * 饿汉模式的核心
     */
    private static HungryMode hungryMode = new HungryMode();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private HungryMode(){
        System.out.println("createthread "+getClass().getSimpleName());
    }

    public static HungryMode getInstance() {
        return hungryMode;
    }
}
