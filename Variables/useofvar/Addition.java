import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt(); 
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        int subtraction = a- b;
        int multiplacation = a*b;
        int division = a/b;
        int modulas = a%b;
        System.out.println("The sum of " +a+" and "+b+" is : "+sum);
    }
}