public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 500, 0.5, 10);
        Cat cat1 = new Cat("Murka", 200, 2, 0);

        dog1.run(400);
        dog1.jump(0.6);
        dog1.swim(5);

        cat1.run(250);
        cat1.jump(1.5);
        cat1.swim(3);
    }
}