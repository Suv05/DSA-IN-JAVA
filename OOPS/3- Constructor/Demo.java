class Student {
    String name;
    int roll;

    ///////////////////////////////////////Constructor overloading/////////////////////////////
//    Student() {
//        System.out.println("Hello world");
//    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}

public class Demo {
    public static void main(String[] args) {

        //Student s1 = new Student();
        Student s2 = new Student("Survive");
        Student s3 = new Student(12345);
        System.out.println(s2.name + s3.roll);

    }
}
