public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Nurzhan", 500, 5);
        Cat cat1 = new Cat("Barsik", 1000, 3);
        Robot robot1 = new Robot("GPT", 5000, 10);

        RunningRoad road = new RunningRoad(5000);
        Wall wall = new Wall(5);

        Competitor[] competitors = {human1, cat1, robot1};
        Obstacle[] obstacles = {road, wall};

        for(Competitor competitor : competitors) {
            boolean passed = true;
            for(Obstacle obstacle : obstacles) {
                if(!obstacle.canPassObstacle(competitor)) {
                    passed = false;
                    System.out.println(competitor.getName() + " не смог пройти все препятствия");
                    break;
                }
            }
            if(passed) {
                System.out.println(competitor.getName() + " смог пройти все препятствия!");
            }
        }
    }
}
