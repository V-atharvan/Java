import java.util.Scanner;

public class evenodd {
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
