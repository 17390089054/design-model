package org.wrf.creative.singleton;

/**
 * @program: design_model
 * @description: 懒汉式-线程安全
 * @author: Wang.Rongfu
 * @create: 2020-06-24 20:05
 **/
public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03(){}

    public static synchronized Singleton03 getInstance(){
        //多线程访问容易创建多个对象
        if(instance==null){
            //延迟实例化，没有用到类不会实例化资源，从而节约资源
            instance=new Singleton03();
        }
        return instance;
    }



}
