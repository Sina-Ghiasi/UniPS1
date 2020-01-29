package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[][][]=new int[5][5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++) {
                    if((i+j+k)%2==0)
                        array[i][j][k] = 1;
                    else
                        array[i][j][k] = 0;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                System.out.print(" ");
                for(int k=0;k<5;k++){
                    System.out.print(" "+array[i][j][k]);
                }
            }
        }
    }
}
