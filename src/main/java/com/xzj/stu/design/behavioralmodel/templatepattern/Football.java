package com.xzj.stu.design.behavioralmodel.templatepattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
