import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int noofstd = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[noofstd];

        for (int i = 0; i < noofstd; i++) {

            students[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter name: ");
            students[i].name = sc.nextLine();

            System.out.print("Enter roll no: ");
            students[i].rollno = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter college name: ");
            students[i].collegeName = sc.nextLine();

            System.out.print("Enter department: ");
            students[i].dept = sc.nextLine();
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < noofstd; i++) {
            students[i].print();
        }

        sc.close();
    }
}

class Student {
    String name;
    int rollno;
    String collegeName;
    String dept;

    void print() {
        System.out.println(
                name + " is learning in " +
                        collegeName + " and student of " +
                        dept + ". Roll no is " + rollno
        );
    }
}