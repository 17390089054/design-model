package org.wrf.action.observer;



/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:09
 **/
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();


}
