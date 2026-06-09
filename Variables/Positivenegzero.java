import java.util.Scanner;

public class Positivenegzero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");

        double a = sc.nextDouble();

        if (a >0 ){
            System.out.println("The no is positive !!");
        }
        else if (a<0){
            System.out.println("The no is negative !!");
        }
        else {
            System.out.println("The no is Zero");
        }
    }
}
