import java.util.Scanner;

public class Product {
    static int multiply(int a ,int b){
        int mul=a*b;
        System.out.println("The product of two no is : "+mul);
        return mul;

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2ed no : ");
        int num2 = sc.nextInt();


        multiply(num1 ,num2);
    }
}