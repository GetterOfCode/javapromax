package com.itheima.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //int[] arr0 = {34,12,23,21};
        Integer[] arr = {34,12,23,21};
        Arrays.sort(arr,(Integer o1, Integer o2)->{
                return o2-o1;
        });
        System.out.println(Arrays.toString(arr));

        Student[] students = new Student[3];
        students[0] = new Student("祁硕",24,183);
        students[1] = new Student("宅哦呜",21,182.6);
        students[2] = new Student("威威",21,186.8);

        Arrays.sort(students, (o1, o2) ->{
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }else if(o1.getAge() == o2.getAge()){
                    return Double.compare(o1.getHeight(),o2.getHeight());
                }
                return -1;

            }
        );
        System.out.println(Arrays.toString(students));
    }
}
