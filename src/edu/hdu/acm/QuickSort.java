package edu.hdu.acm;


import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] a = new int[n];

            //数组创建
            for (int i = 0; i <= n - 1; i++) {
                a[i] = input.nextInt();
            }
            //快速排序
            sort(a, 0, a.length - 1);
            //数组输出
            int num = 1;
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(a[j]);
                if (num != n)
                    System.out.print(" ");
                num++;
            }
        }
    }
    //快速排序
    private static void sort(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            sort(a, left, p - 1);
            sort(a, p + 1, right);
        }
    }

    //快速排序数组划分
    private static int partition(int[] a, int left, int right) {
        int x = a[right];
        int p = left - 1;
        for (int i = left; i < right; i++) {
            if (a[i] <= x) {
                p++;
                int temp = a[p];
                a[p] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[p+1];
        a[p+1] = a[right];
        a[right] = temp;
        return p + 1;
    }
}

    /*private static void sort(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int axis = a[left];
        if(i>j)
            return;
        while (i < j) {
            while (axis < a[j] && i < j) {
                j--;
            }
                while (a[i] <= axis && i < j) {
                    i++;
                }
                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            a[left] = a[i];
            a[i] = axis;

            sort(a, left, i - 1);
            sort(a, i + 1, right);

        }*/




