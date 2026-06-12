import java .util.*;

public class Swapfunction {
    static void swap(int num1 ,int num2 ){
        int temp=num1;
         num1=num2;
         num2=temp;
        System.out.println("the valu of 1st no is : "+ num1);
        System.out.println("the valu of 2ed no is : "+ num2);
    }
    public static void main(String[] args) {
        Scanner a = new Scanner((System.in));
        System.out.print("Enter the 1st no : ");
        int num1 = a.nextInt();
        System.out.print("Enter the 2ed no : ");
        int num2 = a.nextInt();
        swap (num1 , num2);
    }
}
