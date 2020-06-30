package org.wrf.creative.builder;

import java.util.Arrays;

/**
 * @program: design_model
 * @description: 抽象建造者 StringBuilder实现
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:07
 **/
public class AbstractStringBuilder {
    protected char [] value;
    protected int count;

    public AbstractStringBuilder(int capacity){
        count=0;
        value=new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        //容量担保
        ensureCapacityInternal(count+1);
        value[count++]=c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        //是否需要扩容
        if(minimumCapacity-value.length>0){
            expandCapacity(minimumCapacity);
        }
    }

    private void expandCapacity(int minimumCapacity) {
        int newCapacity=value.length*2+2;
        if(newCapacity-minimumCapacity <0){
            newCapacity=minimumCapacity;
        }
        if(newCapacity<0){
            if(minimumCapacity<0){//溢出
                throw new OutOfMemoryError();
            }
            newCapacity=Integer.MAX_VALUE;
        }
        value= Arrays.copyOf(value,newCapacity);
    }


}
