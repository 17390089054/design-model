package org.wrf.creative;

/**
 * @program: design_model
 * @description: 单例模式
 *   目标：
 *      确保一个类只有一个实例，并提供该实例的全局访问点。
 *   实现：
 *      使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。
 *      私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 *   应用：
        Logger Classes
        Configuration Classes
        Accesing resources in shared mode
        Factories implemented as Singletons
     JDK：
        java.lang.Runtime#getRuntime()
        java.awt.Desktop#getDesktop()
        java.lang.System#getSecurityManager()
 *
 * @author: Wang.Rongfu
 * @create: 2020-06-24 19:59
 **/

