
public class Cat extends Animal implements Pet,PestControl {
    Cat(String name, int age) {
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
