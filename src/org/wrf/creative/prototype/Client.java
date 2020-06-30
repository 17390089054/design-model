package org.wrf.creative.prototype;

/**
 * @program: design_model
 * @description: 客户端
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:28
 **/
public class Client {
    public static void main(String[] args) {
        Prototype prototype=new ConcretePrototype("abc");
        Prototype clone=prototype.myClone();
        System.out.println(clone.toString());
    }
}
