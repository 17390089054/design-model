package org.wrf.action.command;

/**
 * @program: design_model
 * @description: 开灯命令
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:21
 **/
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
