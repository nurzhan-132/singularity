class Cat {
    private String name;
    private int appetite;
    private boolean isHungry = true;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        int foodToEat = Math.min(plate.getFood(), appetite);
        plate.decreaseFood(foodToEat);

        if((double) foodToEat / appetite >= 0.7) { // if cat could eat more than 70% of his appetite, then cat is not hungry anymore
            isHungry = false;
        }
        System.out.println(name + " ate " + foodToEat + " food");
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(name + " is hungry: " + isHungry);
    }
}