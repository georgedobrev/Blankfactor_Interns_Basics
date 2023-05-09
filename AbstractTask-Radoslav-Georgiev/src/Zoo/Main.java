package Zoo;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(false, "Asen", 56);
        Lion lion = new Lion(false, "Gosho", 23);
        Shark shark = new Shark(false, "Ivan", 11);
        Snake snake = new Snake(true, "Ivanka", 3);
        Spider spider = new Spider(true, "Pesho", 12);
        System.out.println(spider);
        System.out.println(shark);
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(snake);
    }
}
