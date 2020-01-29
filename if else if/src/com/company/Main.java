package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int x;
        x=input.nextInt();
	    if (x==1){
	        for(int y=10;y>0;y--){
                System.out.println();
                for(int z=10;z>0;z--){
                    System.out.print(" * ");
                }
            }
        }
	    else{
            System.out.println("*");
        }

    }
}
