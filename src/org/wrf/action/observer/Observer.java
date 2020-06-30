package org.wrf.action.observer;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:10
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
