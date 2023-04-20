package com.itheima.interfaceTest;

public class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println(name + "正在开机！");
    }
    public void installUSB(USB usb){
        usb.connect();
        if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.keyDown();
        }else{
            Mouse mouse = (Mouse) usb;
            mouse.dbClick();

        }
        usb.unconnect();
    }
}
