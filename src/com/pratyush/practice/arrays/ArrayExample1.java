package com.pratyush.practice.arrays;

public class ArrayExample1 {

    public static void main(String[] args) {
        int arr[];
        arr = new int[5];//create an array of size 5
        arr[0] = 5;// 0th position
        arr[1] = 18;//1st position
        arr[arr.length - 1] = 48;//4th position

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0] = " + arr[0]); // 0th position of an array
        System.out.println(arr[0]);
    }

}
