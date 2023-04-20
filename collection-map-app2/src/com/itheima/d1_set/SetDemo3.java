package com.itheima.d1_set;

import java.util.*;

public class SetDemo3 {
    public static void main(String[] args) {
//        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("祁硕",24,"男");
        Student s2 = new Student("祁硕",24,"男");
        Student s3 = new Student("倪晨晨",19,"男");
        /*       System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);*/
       // System.out.println(sets);
        Set<Student> sets1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //sets1.addAll(sets);
        Collections.addAll(sets1,s1,s2,s3);
        System.out.println(sets1);

    }



}
