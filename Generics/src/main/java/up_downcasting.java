public class up_downcasting {
    static void main(String[] args) {


        //upcasting
        String s1 = "This is upcasting";
        Object obj1 = s1 ;

        System.out.println(obj1);

        //downcasting
        

        Object obj2 = "This is downcasting";
        String s2 = (String) obj2;
        System.out.println(obj2);

        //this is type casting
        int a = 10;
        String s = Integer.toString(a);
        System.out.println(s);
        System.out.println(s.getClass());
    }
}
