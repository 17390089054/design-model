package org.wrf.creative.factory.simpleFactory;

/**
 * @program: design_model
 * @description: 简单工厂
 *    封装类实例化细节
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:16
 **/
public class SimpleFactory {
    public Product getProduct(int type){
        switch (type){
            case 1:
                return new ConcreteProduct();
            case 2:
                return new ConcreteProduct2();
            case 3:
                return new ConcreteProduct3();
        }
        return new ConcreteProduct();
    }

}
