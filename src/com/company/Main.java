package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Integer[] ar={3,6,1,-3,14};
        MinMax<Integer> minMax=new MinMax<>(ar);
        System.out.println(minMax.Max());




    }
}
