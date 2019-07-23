package com.xzj.stu.design.createdmodel.prototypepattern;

import java.util.Hashtable;

/**
 * @author zhijunxie
 * @date 2019/3/18
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     * shapeMap.put(shapeKey, shape);
     *
     */
    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
