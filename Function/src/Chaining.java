public class Chaining {
    static void main(String[] args) {
        a();
    }

    static void a () {
        b();
        System.out.println("Hi");
    }

    static  void b () {
        c();
        System.out.println("Hello");
    }

    static void c () {
        System.out.println("Good Morning");
    }

}


