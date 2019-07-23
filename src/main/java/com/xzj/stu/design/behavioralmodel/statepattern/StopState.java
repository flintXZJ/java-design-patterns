package com.xzj.stu.design.behavioralmodel.statepattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
