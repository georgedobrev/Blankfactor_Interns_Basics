abstract class Animal {
    String name;
    int age;
    abstract void makeSound();
}
class Dog extends Animal implements Pet, ServiceAnimal {
    Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void makeSoumd() {
        System.out.println("Bau Bau");
    }
    public void play() {
        System.out.println("Playiing Fetch");
    }
    public void assist() {
        System.out.println("Guiding the blind");
    }
    public void serve() {
        System.out.println("Therapeutic service");
    }
}

class Cat extends Animal implements Pet,PestControl {
    Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Meow Meow");
    }
    public void play() {
        System.out.println("Playing woth a ball of yarn");
    }
    public void hunt() {
        System.out.println("Catching mice");
    }
}

interface Pet {
    void play();
}

interface PestControl {
    void hunt();
}
interface ServiceAnimal {
    void assist();
    void serve();
}