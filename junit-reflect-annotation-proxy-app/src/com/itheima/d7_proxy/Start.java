package com.itheima.d7_proxy;

//import java.nio.charset.StandardCharsets;

public class Start implements Skill{
    private String  name;

    public Start() {
    }

    public Start(String name) {
        this.name = name;
    }

    @Override
    public void sing(String music) {
        System.out.println(name + "唱歌！唱得是"+music);
    }

    @Override
    public void jump() {
        System.out.println(name + "跳舞！");

    }
}
