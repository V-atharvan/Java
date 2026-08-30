public class twoGenParameter {
    static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(15,"Manas");
        System.out.println(p1.first +" "+ p1.second);
    }
}

//generic
class Pair<T,U> {
    T first ;
    U second ;
    Pair (T first, U second){
        this.first = first;
        this.second= second;
    }
}
