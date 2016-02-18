package p1;

public class Main {

    public static void main(String[] args) {
        Pet dog1 = new Dog();
        dog1.name = "Rover";
        dog1.breed = "boxer";
        dog1.weight = 20;
        dog1.age = 1;

        Pet cat1 = new Cat();

        System.out.println(dog1);
    }
}

class Pet {
    String name;
    String breed;
    double weight;
    int age;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Dog extends Pet {
    String vocalize = "bark";
    int legs = 4;
    Boolean houseTrained = false;


    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Dog{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", houseTrained=" + houseTrained +
                '}';
        return s1 + "\n" + s2;
    }
}

class Cat extends Pet {
    String vocalize = "meow";
    int legs = 4;
    Boolean houseTrained = false;
}

