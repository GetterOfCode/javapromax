package com.itheima.d2_reflect;

public class Student {
    private String name;
    private int age;
    public Student(){
    }
    private Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void eat(){
        System.out.println(name+"哈哈");

    }
    private void eat(String food){
        System.out.println(name+"吃"+food);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
