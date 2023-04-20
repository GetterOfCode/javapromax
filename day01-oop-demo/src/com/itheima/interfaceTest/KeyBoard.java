package com.itheima.interfaceTest;

public class KeyBoard implements USB{
    private String name;
    @Override
    public void connect(){
        System.out.println(name + "键盘连接了电脑！");
    };
    @Override
    public void unconnect(){
        System.out.println(name + "键盘从电脑中拔出！");
    };
    public void keyDown(){
        System.out.println(name + "键盘敲击了！");
    }
    public KeyBoard() {
    }

    public KeyBoard(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
