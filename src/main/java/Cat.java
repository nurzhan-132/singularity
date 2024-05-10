class Cat extends Animal {
    public Cat(String name, int maxRunDistance, double maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can swim: false");
    }
}