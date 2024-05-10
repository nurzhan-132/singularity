class Animal {
    protected String name;
    protected int maxRunDistance;
    protected double maxJumpHeight;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, double maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " can run: true");
        } else {
            System.out.println(name + " can run: false");
        }
    }

    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " can jump: true");
        } else {
            System.out.println(name + " can jump: false");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " can swim: false");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " can swim: true");
        } else {
            System.out.println(name + " can swim: false");
        }
    }
}
