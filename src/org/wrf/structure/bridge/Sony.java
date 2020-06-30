package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: 索尼电视机
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:15
 **/
public class Sony extends TV {
    @Override
    public void on() {
        System.out.println("Sony.on()");
    }

    @Override
    public void off() {
        System.out.println("Sony.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
