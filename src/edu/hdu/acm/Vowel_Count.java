package edu.hdu.acm;

import java.util.Scanner;

public class Vowel_Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        if (Str.length() <= 100) {
            String[] temp1 = Str.split("a");
            String[] temp2 = Str.split("e");
            String[] temp3 = Str.split("i");
            String[] temp4 = Str.split("o");
            String[] temp5 = Str.split("u");
            int num1 = temp1.length - 1;
            int num2 = temp2.length - 1;
            int num3 = temp3.length - 1;
            int num4 = temp4.length - 1;
            int num5 = temp5.length - 1;
            System.out.println("a" + ":" + num1);
            System.out.println("e" + ":" + num2);
            System.out.println("i" + ":" + num3);
            System.out.println("o" + ":" + num4);
            System.out.println("u" + ":" + num5);
        }
    }
}
