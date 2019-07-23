package com.xzj.stu.design.createdmodel.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 反序列化机制破解单例模式（枚举除外）
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class DeserializationBreakSingleton {

    public static void main(String[] args) throws Exception{

        DoubleCheckMode instance1 = DoubleCheckMode.getInstance();
        DoubleCheckMode instance2 = DoubleCheckMode.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\\\\\app\\\\\\DoubleCheckMode.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance1);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\\\\\app\\\\\\DoubleCheckMode.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        DoubleCheckMode instance3 = (DoubleCheckMode) objectInputStream.readObject();

        System.out.println(instance3);
    }

//    如何避免实现序列化单例模式的漏洞：
//    class Singleton implements Serializable{
//
//        private static final Singleton singleton = new Singleton();
//
//        private Singleton() {
//        }
//        public static Singleton getInstance(){
//            return singleton;
//        }
//        //反序列化定义该方法，则不需要创建新对象
//        private Object readResolve() throws ObjectStreamException{
//            return singleton;
//        }
//    }
}
