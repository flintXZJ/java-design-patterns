package com.xzj.stu.design.behavioralmodel.chainpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
