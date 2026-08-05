public class ParameterConst {
    static void main(String[] args) {
        Parameter p1 = new Parameter("Atharav",22);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}

class Parameter {
    String name ;
    int age ;
    Parameter(String n,int a){
        name=n;
        age=a;
    }
}
