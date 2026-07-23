public class functionOverloading {
    static void main(String[] args) {
        greet();
        greet("Amrut");
    }

    static void greet () {
        System.out.println("Good Morning :)");
    }

    static void greet (String name ) {
        System.out.println("Good Morning :)" + name );
    }
}
