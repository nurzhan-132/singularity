public class Robot implements Competitor {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров");
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}