package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: RCA电视机
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:17
 **/
public class RCA extends TV {
    @Override
    public void on() {
        System.out.println("RCA.on()");
    }

    @Override
    public void off() {
        System.out.println("RCA.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("RCA.tuneChannel()");
    }
}
