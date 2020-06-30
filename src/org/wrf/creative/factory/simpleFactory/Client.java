package org.wrf.creative.factory.simpleFactory;

/**
 * @program: design_model
 * @description: 客户类
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:20
 **/
public class Client {
    public static void main(String[] args) {
        SimpleFactory sf=new SimpleFactory();
        Product pro=sf.getProduct(2);
        System.out.println(pro);
    }
}
