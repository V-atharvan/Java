public class Cons {
    public static void main(String[] args) {
        Vehical v = new Vehical("BMW");
        Vehical v2 = new Vehical("Bmw", 232,"abc");

        v.display();
        v2.display();
    }
}

class Vehical{
    String name;
    int model;
    String modelName;

    Vehical(String name){
        System.out.println(name);
    }

    Vehical(String name,int model,String modelName){
        this.name = name;
        this.model = model;
        this.modelName = modelName;
    }

    void display() {
        System.out.println("Brand is : " + name);
        System.out.println("Model Year: " + model);
        System.out.println("Model Name: " + modelName);
    }
}