package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: 遥控器抽象类
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:18
 **/
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv){
        this.tv=tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
