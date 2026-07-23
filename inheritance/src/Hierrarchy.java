public class Hierrarchy {
    static void main(String[] args) {
        Student s = new Student();
        MedicalStd m = new MedicalStd();
        Engi e = new Engi();

        s.stmt();



        m.stmt();
        m.attend();
        e.stmt();
        e.present();
    }
}

class Student{
    public void stmt(){
        System.out.println("He is a student");
    }
}

class MedicalStd extends Student {
    public void attend () {
        System.out.println("He is a medical student ");
    }
}

class Engi extends Student{
    public void present (){
        System.out.println("He is a Engineering student ");
    }
}