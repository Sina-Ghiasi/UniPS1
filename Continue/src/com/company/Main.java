package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i=0;
        while(i<100){
            i++;
            if(i%2 ==0) {
                continue;
            }
            System.out.println(i);
             
        }
    }
}