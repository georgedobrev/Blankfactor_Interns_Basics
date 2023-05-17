public class Dog extends Animal implements Pet, ServiceAnimal {
    Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
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
