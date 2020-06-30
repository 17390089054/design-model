package org.wrf.creative.builder;

/**
 * @program: design_model
 * @description: 客户端
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:20
 **/
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
