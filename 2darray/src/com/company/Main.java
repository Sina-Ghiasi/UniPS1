package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][]=new int[3][3];
        Scanner input =new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter a num :");
                String s= input.nextLine();
                a[i][j]=Integer.parseInt(s);
            }
        }
        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
        }
    }
}
