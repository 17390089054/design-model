package org.wrf.structure.decorator;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-26 22:33
 **/
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
