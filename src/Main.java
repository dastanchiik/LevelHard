import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Borya");
        fish.setAge(1);
        System.out.println("Fish name: "+fish.getName()+"\n"+"Fish age: "+fish.getAge());
        fish.properties();
        Cat cat = new Cat();
        cat.setName("Sima");
        cat.setAge(3);
        System.out.println("Cat name: "+cat.getName()+"\n"+"Cat age: "+cat.getAge());
        cat.properties1();
        Dog dog = new Dog();
        dog.setName("Karl");
        dog.setAge(4);
        System.out.println("Dog name: "+dog.getName()+"\n"+"Dog age: "+dog.getAge());
        dog.properties2();
        Carrot carrot = new Carrot();
        carrot.setName("Garik");
        carrot.setAge(2);
        carrot.setColor("rainbow");
        System.out.println("Carrot name: "+carrot.getName()+"\n"+"Carrot age: "+carrot.getAge()+"\n"+"Carrot color: "+carrot.getColor());
        carrot.properties3();
    }
}