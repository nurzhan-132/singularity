class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public void fillMax() {
        food = capacity;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Not enough food in the plate.");
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        } else {
            System.out.println("Invalid amount of food.");
        }
    }

    public void info() {
        System.out.printf("Plate %d / %d\n", food, capacity);
    }

    public int getFood() {
        return food;
    }
}
