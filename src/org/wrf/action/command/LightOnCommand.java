package org.wrf.action.command;

/**
 * @program: design_model
 * @description: 开灯命令
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:21
 **/
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
