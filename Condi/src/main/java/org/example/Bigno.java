package org.example;

import java.util.Scanner;

public class Bigno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first  no : ");
        int a = sc.nextInt();

        System.out.print("Enter the second no : ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("The big ni is " + a);
        }
        else if (b>a) {
            System.out.println("The big no is " + b);
        }
        else {
            System.out.println("Both values are equal!!!!!!");
        }
    }

    public static class evenodd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first no  : ");
            int a = sc.nextInt();

            System.out.print("Enter the second no : ");
            int b = sc.nextInt();

            if (a>b){
                System.out.println(a+" is grater than " + b);
            }
            else{
                System.out.println(b+" is grater than "+a);
            }
        }
    }
}
