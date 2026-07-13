package org.example;

import java .util.*;
public class Input{
    public static void main (String args[]){


        System.out.print("Enter the size of the array");
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int numbers []= new int[size];
        for ( int i =0 ; i<size ;i++){
            System.out.print("Enter the number");
            numbers[i]=sc.nextInt();
        }
        for ( int i =0 ; i<size ;i++){
            System.out.println(numbers[i]);
        }
    }
}