package com.itheima.d2_reflect;






import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestStudentDemo1  {
    @Test
    public void getAclass() throws Exception{
        Class c = Student.class;

        System.out.println(c.getName());
        System.out.println(c);

        Class c1 = Class.forName("com.itheima.d2_reflect.Student");
        System.out.println(c1.getName());
        System.out.println(c1);

        Student s = new Student();
        Class c2 = s.getClass();

        System.out.println(c2.getName());
        System.out.println(c2);
    }


    public void getAClass() throws Exception{
        Class studentClass = Student.class;
        Constructor[] constructors = studentClass.getConstructors();//取public构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"====》"+constructor.getParameterCount());
        }
        Constructor[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName()+"====》"+constructor.getParameterCount());
        }
        System.out.println("===========================================================");
        Constructor constructor = studentClass.getConstructor();
        System.out.println(constructor.getName() + "====>" + constructor.getParameterCount());
        System.out.println("===========================================================");
        Constructor declaredConstructor = studentClass.getDeclaredConstructor();
        System.out.println(declaredConstructor.getName() + "====》" + declaredConstructor.getParameterCount());


    }

    public  void useConstructor()throws Exception{
        Class c = Student.class;
        Constructor constructor = c.getConstructor();
        constructor.setAccessible(true);//碰到私有构造器可以暴力反射
        Student student = (Student) constructor.newInstance();
        System.out.println(student);

        Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Student student1 =(Student) declaredConstructor.newInstance("祁硕", 18);
        System.out.println(student1.getName());
        student1.setName("qq");
        System.out.println(student1);
        //反射可以破坏封装性

    }

    public void getField()throws Exception{
        Class c  = Student.class;
        //Field[] fields = c.getDeclaredFields();
        Field age = c.getDeclaredField("age");
        System.out.println(age.getType());
        Student student = new Student();
        age.setAccessible(true);//暴力打开权限

        age.set(student,18);
        System.out.println(student);
        //age.get(student, age);
        //age.get
        System.out.println((int) (age.get(student)));
    }



    public void useMethod() throws Exception{
        Class c = Student.class;
        Method declaredMethod = c.getDeclaredMethod("eat");
        declaredMethod.setAccessible(true);

        Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Student student = (Student)declaredConstructor.newInstance("祁硕",18);
        declaredMethod.invoke(student);

        Method eat = c.getDeclaredMethod("eat", String.class);
        //System.out.println(student);
        eat.setAccessible(true);
        eat.invoke(student,"牛肉");
    }
    @Test
    public void ReflectDemo() throws Exception{
        //需求：反射实现泛型擦除后，加入其它类型的元素
        ArrayList<String> lists1 = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();

        System.out.println(lists1.getClass());
        System.out.println(lists2.getClass());

        System.out.println(lists1.getClass() == lists2.getClass());

    }
}
