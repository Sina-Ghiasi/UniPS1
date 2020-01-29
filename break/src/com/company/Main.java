package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String s;
        int i;
        while (true) {
            System.out.println("Enter 0 or 1: ");
            s = in.nextLine();
            i = Integer.parseInt(s);
            if (i == 1)
                System.out.println(" True");
            else {
                System.out.println("false end");
                break;
            }

        }
    }
}
