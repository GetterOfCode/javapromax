package com.itheima.interfaceTest;

public class Mouse implements USB{
    private String name;
    @Override
    public void connect(){
        System.out.println(name + "鼠标连接了电脑！");
    };
    @Override
    public void unconnect(){
        System.out.println(name + "鼠标从电脑中拔出！");
    };
    public void dbClick(){
        System.out.println(name + "鼠标双击了！");
    }

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
