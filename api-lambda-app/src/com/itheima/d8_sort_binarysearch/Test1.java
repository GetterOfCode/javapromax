package com.itheima.d8_sort_binarysearch;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {21,12,15,25,10,16,1,19};
        popSort(arr);
        System.out.println(Arrays.toString(arr));
        int rs = Arrays.binarySearch(arr,0);
        System.out.println(rs);
    }

    //选择排序
    public static void sort(int[] arr){
        for (int i = 0 ; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
    }
    //冒泡排序
    public static void popSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
}
