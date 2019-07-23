package com.xzj.stu.design.createdmodel.prototypepattern;

/**
 * 创建一个实现了 Cloneable 接口的抽象类
 *
 * @author zhijunxie
 * @date 2019/3/18
 */

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
