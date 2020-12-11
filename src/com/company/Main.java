package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int d1 = sc.nextInt();
	    int v1 = sc.nextInt();
	    int d2 = sc.nextInt();
	    int v2 = sc.nextInt();
	    int total = sc.nextInt();
	    int produced = 0, i;
	    for(i=1; produced<total; i++){
	        if(i>=d1){
	            produced = produced + v1;
            }
	        if(i>=d2){
                produced = produced + v2;
            }
        }
        System.out.println(i-1);
    }
}
