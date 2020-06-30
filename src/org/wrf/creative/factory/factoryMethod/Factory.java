package org.wrf.creative.factory.factoryMethod;

import org.wrf.creative.factory.simpleFactory.Product;

/**
 * @program: design_model
 * @description: 抽象工厂方法
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:29
 **/
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething(){
       Product product=factoryMethod();
       //do something with the product
    }

}
