package org.wrf.creative.singleton;

/**
 * @program: design_model
 * @description: 饿汉式-线程安全
 * @author: Wang.Rongfu
 * @create: 2020-06-24 20:10
 **/
public class Singleton02 {
    //直接实例化-避免了线程安全问题
    private static Singleton02 instance =new Singleton02();

    private Singleton02(){}

    public Singleton02 getInstance(){
        return instance;
    }

}
