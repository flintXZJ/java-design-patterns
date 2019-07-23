package com.xzj.stu.design.behavioralmodel.templatepattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
