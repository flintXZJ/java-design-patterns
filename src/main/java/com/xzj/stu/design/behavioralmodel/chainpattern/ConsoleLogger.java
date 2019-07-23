package com.xzj.stu.design.behavioralmodel.chainpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
