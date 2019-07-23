package com.xzj.stu.design.behavioralmodel.chainpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
