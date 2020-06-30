package org.wrf.creative.factory.abstractFactory;

/**
 * @program: design_model
 * @description: 抽象工厂
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:57
 **/
public abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}
