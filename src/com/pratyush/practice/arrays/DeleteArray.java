package com.pratyush.practice.arrays;

public class DeleteArray {
    public static void main(String[] args) {
        int ar[] = {36, 65, 88, 55, 42, 15};
        ar = deleteArr(ar, 2);
    }


    static int[] deleteArr(int a[], int in) {
        if (in < 0 || in >= a.length) {
            System.out.println("Index not in range");
            return a;
        }
        int n[] = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (i < in)
                n[i] = a[i];
            else
                n[i] = a[i + 1];

        }
        return n;
    }
}



