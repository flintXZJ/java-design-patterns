package com.xzj.stu.design.behavioralmodel.chainpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class Client {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();

        System.out.println(chainOfLoggers);

        chainOfLoggers.logMessage(AbstractLogger.INFO, "this is info");
        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "this is debug");
        chainOfLoggers.logMessage(AbstractLogger.ERROR, "this is error");
    }

}
