public class RunningRoad implements Obstacle {
    private int distance;

    public RunningRoad(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean canPassObstacle(Competitor competitor) {
        return competitor.run(distance);
    }
}
