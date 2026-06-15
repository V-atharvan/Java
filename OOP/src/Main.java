import  java.util.*;
public  class Main {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Abhisheak";
        s1.rollno=12;
        s1.collegeName="NBNSCOE";
        s1.dept ="ENTC";
        s1.print();

    }
}

class Student {
    String name ;
    int rollno;
    String collegeName;
    String dept ;

    void Attendence(){
        System.out.println("Attended college !");
    }

    void print(){
        System.out.println(name+" is learning in "+collegeName+" and student of "+dept+" Roll no is "+rollno);
    }
}