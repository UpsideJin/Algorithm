package edu.hdu.acm;

import java.util.Scanner;

public class Contractoutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        String[] str = Str.split(" ");

        int left = 0;
        int right = str.length - 1;
        int num = 1;
        String temp;

        while(left<=right){
            temp = str[right];
            str[right] = str[left];
            str[left] = temp;
            left++;
            right--;
        }
        for(int k = 0;k<=str.length - 1 ;k++){
            System.out.print(str[k]);
            if(num!=str.length)
                System.out.print(" ");
            num++;
        }

    }
}
