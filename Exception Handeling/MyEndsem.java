import java.util.*;
class person{
    String name;
    int age;
    

}

class student extends person{
    float cgpa;

    student(String name, int age, float cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;

    }

    public void displayS() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("Cgpa " + cgpa);
    }
}

class teacher extends person{
    int salary;
    teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void displayT() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("Salary " + salary);
    }
}




public class MyEndsem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] arr = new student[5];
        arr[0]=new student("Suv",12,9.2f);
        arr[1]=new student("Suv",12,9.8f);
        arr[2]=new student("Suv",12,8.87f);
        arr[3]=new student("Suv",12,6.52f);
        arr[4]=new student("Suv",12,7.9f);

        for(student element:arr){
           element.displayS();
        }

        teacher[] arr1 = new teacher[3];
        arr1[0] = new teacher("Raja", 42, 12000);
        arr1[1] = new teacher("Raja", 42, -1223);
        arr1[2] = new teacher("Raja", 42, 16000);
        for(teacher element:arr1){
            element.displayT();
        }



    }
}
