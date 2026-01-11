import java.util.*;
public class Userinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();           // "next" is used for only single tocken from the user ,the tocken mins the single word
        String name1 = sc.nextLine();           // "nextLine" is used for only single tocken from the user ,the tocken mins the single word
        System.out.println(name);
        System.out.println(name1);



        Scanner bc = new Scanner(System.in);
        int a = sc.nextInt();                      //"nextInt"is used to get int value from the user 
        System.out.println(a);


        Scanner floatingvalue = new Scanner(System.in);
        Float b = floatingvalue.nextFloat();
        System.out.println(b);

    }
}