class demo1 {
    int i;
    void setvalue(int i){
        this.i=i;  //using this keyward it means this reffers to the main instance variable i
    }
    void getvalue () {
        System.out.println(i);
    }
}


public class thisdelo {
    static void main(String[] args) {
        demo1 t = new demo1();
        t.setvalue(2);
        t.getvalue();

    }
}
