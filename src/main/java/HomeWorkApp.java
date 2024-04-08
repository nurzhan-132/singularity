// 1
public class HomeWorkApp {
    public static void main(String[] args) {
        // 6
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
    }
    // 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 3
    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 4
    public static void printColor() {
        int value = 5;
        String res = "";
        if(value <= 0) {
            res = "Красный";
        } else if(value > 0 && value <= 100) {
            res = "Желтый";
        } else {
            res = "Зеленый";
        }
        System.out.println(res);
    }

    // 5
    public static void compareNumber() {
        int a = 56;
        int b = 65;
        if(a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
