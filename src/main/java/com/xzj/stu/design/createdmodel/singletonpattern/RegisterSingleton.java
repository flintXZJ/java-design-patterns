package com.xzj.stu.design.createdmodel.singletonpattern;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登记式单例模式是对一组单例模式进行的维护, 保证 map 中的对象是同一份
 * Spring 中使用的就是类似的模式
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class RegisterSingleton {
    /**
     * 登记式单例模式, 保证map中的对象是同一份
     */
    private static Map<String, Object> map;

    static {
        map = new ConcurrentHashMap<String, Object>();
        map.put(RegisterSingleton.class.getName(), new RegisterSingleton());
    }

    private RegisterSingleton(){}

    public static Object getInstance(String name) {
        if (StringUtils.isBlank(name)) {
            name = RegisterSingleton.class.getName();
        }

        if (map.get(name) == null) {
            try {
                map.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
