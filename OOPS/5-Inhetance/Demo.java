class Animal {
    String name;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

class Fish extends Animal {
    void drink() {
        System.out.println("drinks water");
    }
}


public class Demo {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.breath();
        f1.drink();

    }
}
