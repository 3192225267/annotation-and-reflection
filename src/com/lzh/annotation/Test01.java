package com.lzh.annotation;

import java.lang.annotation.*;

@Myannotation
public class Test01 {
    @Myannotation
    public void show(){

    }

}
// 定义一个注解
// @Target 表示我们的注解可以用在哪些地方
@Target(value= { ElementType.TYPE,ElementType.METHOD})
// 表示我们的注解在什么时候还有效
@Retention(value = RetentionPolicy.RUNTIME)
// 关于是否将我们的注解生成在JavaDoC中
@Documented
// 子类可以继承父类的注解
@Inherited
@interface Myannotation{

}