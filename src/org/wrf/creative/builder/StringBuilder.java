package org.wrf.creative.builder;

/**
 * @program: design_model
 * @description: 自定义StringBuilder
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:18
 **/
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }

}
