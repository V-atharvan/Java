class demo {
    int i;
    void setvalue(int x){
        i=x;
    }
    void getvalue () {
        System.out.println(i);
    }
}


public class test {
    static void main(String[] args) {
        demo t = new demo();
        t.setvalue(2);
        t.getvalue();

    }
}
