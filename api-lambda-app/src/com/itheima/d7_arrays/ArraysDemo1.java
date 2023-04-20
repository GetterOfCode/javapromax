package com.itheima.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10,2,55,13,25};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分搜索
        int rs = Arrays.binarySearch(arr, 55);
        System.out.println(rs+1);
        //返回不存在值的位置+1

        System.out.println(Arrays.binarySearch(arr, 65));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
