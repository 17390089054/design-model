package org.wrf.action.iterator;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:47
 **/
public interface Iterator<Item> {
    Item next();
    boolean hasNext();
}