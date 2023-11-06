class Student {
    String name;
    int roll;
    int marks;
    String password;

    Student() {
        System.out.println("Calling constructor");
    }

    /////////////////////Copy Constructor//////////
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 123;
        s1.name = "shiv";
        s1.password = "4321";

        Student s2=new Student(s1);
        s2.password="1234";
        System.out.println(s2.name);


    }
}
