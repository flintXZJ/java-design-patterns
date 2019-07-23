package com.xzj.stu.design.behavioralmodel.templatepattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class Client {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();

        Football football = new Football();
        football.play();
    }
}
