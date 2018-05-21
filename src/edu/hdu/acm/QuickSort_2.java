package edu.hdu.acm;

import java.util.Scanner;

public class QuickSort_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] a = new int[100];

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
            }
        }
    }

    private static void sort(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int axis = a[left];
        if (i > j)
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

    }
}