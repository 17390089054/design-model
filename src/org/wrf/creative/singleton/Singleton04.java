package org.wrf.creative.singleton;

/**
 * @program: design_model
 * @description: 双重检测
 *  instance 采用 volatile 关键字修饰也是很有必要的， instance = new Singleton(); 这段代码其实是分为三步执行：
 *      1、为 instance 分配内存空间
 *      2、初始化 instance
 *      3、将 instance 指向分配的内存地址
 * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。
 * 指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
 * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getInstance() 后发现 instance 不为空，
 * 因此返回 instance，但此时 instance 还未被初始化。
 * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 * @author: Wang.Rongfu
 * @create: 2020-06-24 20:05
 **/
public class Singleton04 {
    private volatile static Singleton04 instance;

    private Singleton04(){}

    public static Singleton04 getInstance(){
        //多线程访问容易创建多个对象
        if(instance==null){
            //加速避免多线程问题
            synchronized (Singleton04.class){
                if(instance==null){
                    instance=new Singleton04();
                }
            }

        }
        return instance;
    }



}
