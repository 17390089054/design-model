package org.wrf.structure.decorator;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-26 22:30
 **/
public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
