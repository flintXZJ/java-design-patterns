package com.xzj.stu.design.behavioralmodel.templatepattern;

/**
 * 抽象类
 *
 * @author zhijunxie
 * @date 2019/4/3
 */
public abstract class Game {

    //模板 为防止恶意操作，一般模板方法都加上 final 关键词
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

    abstract protected void initialize();
    abstract protected void startPlay();
    abstract protected void endPlay();
}
