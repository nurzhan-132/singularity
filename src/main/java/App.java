public class App {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Murka", 50), new Cat("Martin2", 300)};
        Plate plate = new Plate(100);

        plate.info();
        plate.fillMax();
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.printInfo();
        }
        System.out.print("After cats ate food: ");
        plate.info();

        plate.addFood(15);
        plate.info();
    }

}