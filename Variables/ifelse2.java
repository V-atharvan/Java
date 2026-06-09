import java.util.Scanner;

public class ifelse2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int a = sc.nextInt();

        if (a>18){
            System.out.println("You can Drive !!!");
        }
        else {
            System.out.println("You Cant drive !!!!!!!!!!");
        }
    }
}
