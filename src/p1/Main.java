package p1;

public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Dog();
        pet1.name = "Rover";
        pet1.breed = "boxer";
        pet1.weight = 20;
        pet1.age = 1;

        Pet pet2 = new Bird();
        pet2.name = "Tweety";
        pet2.breed = "parrot";
        pet2.weight = .25;
        pet2.age = 10;

        if (pet2 instanceof Bird)
            pet2.learnedToTalk(pet2);
        else
            System.out.println("Sorry, only birds can learn to talk");

        System.out.println(pet1 + "\n\n" + pet2);
    }
}

abstract class Pet {
    String name;
    String breed;
    double weight;
    int age;

    void learnedToTalk(Pet arg) {
        Bird bird = (Bird) arg;
        bird.doesTalk = true;
    }

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

class Bird extends Pet {
    String vocalize = "tweet";
    int legs = 2;
    Boolean doesTalk = false;

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", doesTalk=" + doesTalk +
                "} ";
    }
}

