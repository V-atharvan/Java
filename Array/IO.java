import java.util.*;

public class IO {
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arrayofno[] = new int[n];
        for (int i=0 ;i<n;i++){
            System.out.print("Enter the no you want to store in array :");
            arrayofno[i]= sc.nextInt();
        }
        for (int j=0; j<arrayofno.length;j++){
            System.out.println("The array element is : "+arrayofno[j]);
        }


        //length of array
        System.out.println("the length of array is : "+ arrayofno.length);


        //to sort array
        Arrays.sort(arrayofno);

        System.out.println(Arrays.toString(arrayofno));
    }
}
