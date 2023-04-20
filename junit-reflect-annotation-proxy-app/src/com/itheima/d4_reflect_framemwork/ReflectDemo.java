package com.itheima.d4_reflect_framemwork;

/**
 * 目标：提供一个通用框架 支持保存所有对象的具体信息
 */
public class ReflectDemo {
    public static void main(String[] args)throws Exception {
        MybatisUtil.save(
                new Student("祁硕",'男',18,"19大数据","做爱"));
        MybatisUtil.save(new Teacher("魏玲花",'男',10000.0));
        MybatisUtil.save(new Dog("旺财",100.0));
    }
}
