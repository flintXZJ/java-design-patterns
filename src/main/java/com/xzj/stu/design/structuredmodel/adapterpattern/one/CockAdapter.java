package com.xzj.stu.design.structuredmodel.adapterpattern.one;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class CockAdapter implements Duck {
    private Cock cock;
    // 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    // 实现鸭的呱呱叫方法
    @Override
    public void quack() {
        // 内部其实是一只鸡的咕咕叫
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
