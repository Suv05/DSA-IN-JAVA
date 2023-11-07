class Student {
    String name;
    int roll;
    int[] marks;
    String password;

    Student() {
        marks = new int[3];
        System.out.println("Calling constructor");
    }

    /////////////////////shall Copy Constructor//////////
//    Student(Student s1) {
//        marks=new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks=s1.marks;
//    }

    /////////////////////Deep Copy Constructor//////////
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 123;
        s1.name = "shiv";
        s1.password = "4321";
        s1.marks[0] = 100;
        s1.marks[1] = 70;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);//we copied here
        s2.password = "1234";

        //
        s1.marks[2] = 90; //but this reference will also show changes

        //but after deep copy it is unchanged
        for (int i : s2.marks) {
            System.out.println(i);
        }
    }
}
