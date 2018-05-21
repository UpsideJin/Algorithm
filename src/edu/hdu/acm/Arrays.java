package edu.hdu.acm;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

                Scanner input = new Scanner(System.in);

                    int n = input.nextInt();
                    int[] a = new int[n];

                    //数组创建
                    for (int i = 0; i < n; i++) {
                        a[i] = input.nextInt();
                    }
                    //快速排序

                    //数组输出
                    for (int j = 0; j < n ; j++)
                    System.out.print(a[j]);
                    }
                }

