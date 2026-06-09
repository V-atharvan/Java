import java.util.*;
public class Large {
    public static void main (String args[]){
        int arr[]={1,2,35,4,5};
        int large = arr[0];
        for (int i=1; i<arr.length; i++){       
            if (arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println(large);
        
    }
}