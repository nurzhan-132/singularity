public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean canPassObstacle(Competitor competitor) {
        return competitor.jump(height);
    }
}
