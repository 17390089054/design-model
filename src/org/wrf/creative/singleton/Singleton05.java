package org.wrf.creative.singleton;

/**
 * @program: design_model
 * @description: 静态内部类实现
 *  当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。
 *  只有当调用 getInstance() 方法从而触发 SingletonHolder.INSTANCE 时
 *  SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 *  这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 * @author: Wang.Rongfu
 * @create: 2020-06-24 20:21
 **/
public class Singleton05 {

    private Singleton05(){ }

    private static class SingletonHolder{
        private static final Singleton05 INSTANCE=new Singleton05();
    }

    public Singleton05 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
