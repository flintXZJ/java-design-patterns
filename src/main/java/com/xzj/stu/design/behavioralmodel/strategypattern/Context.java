package com.xzj.stu.design.behavioralmodel.strategypattern;

/**
 * 使用策略的类
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y){
        this.strategy.draw(radius, x, y);
    }
}
