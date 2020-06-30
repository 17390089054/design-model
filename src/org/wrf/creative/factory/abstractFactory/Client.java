package org.wrf.creative.factory.abstractFactory;

/**
 * @program: design_model
 * @description: 客户端
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:01
 **/
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new ConcreteFactory1();
        AbstractProductA productA=abstractFactory.createProductA();
        AbstractProductB productB=abstractFactory.createProductB();
        //do something
    }
}
