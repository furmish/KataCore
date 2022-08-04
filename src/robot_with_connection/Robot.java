package robot_with_connection;

public class Robot implements RobotConnection {
    private int x;
    private int y;
    private Direction direction;

    public Robot() {
        this.direction = Direction.UP;
    }

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.LEFT;
            case LEFT -> this.direction = Direction.DOWN;
            case DOWN -> this.direction = Direction.RIGHT;
            case RIGHT -> this.direction = Direction.UP;
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.RIGHT;
            case LEFT -> this.direction = Direction.UP;
            case DOWN -> this.direction = Direction.LEFT;
            case RIGHT -> this.direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP -> y++;
            case LEFT -> x--;
            case DOWN -> y--;
            case RIGHT -> x++;
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    for (int i = 0; ; i++) {
        try (RobotConnection connection = robotConnectionManager.getConnection()) {
            connection.moveRobotTo(toX, toY);
            break;
        } catch (RobotConnectionException e) {
            if (i == 2) {
                throw e;
            }
        }
    }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
//        Direction needDirectionY = toY > robot.getY() ? Direction.UP : Direction.DOWN;
//        Direction needDirectionX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
//
//        while (robot.getDirection() != needDirectionY) {
//            robot.turnRight();
//        }
//        while (robot.getY() != toY) {
//            robot.stepForward();
//        }
//
//        while (robot.getDirection() != needDirectionX) {
//            robot.turnRight();
//        }
//        while (robot.getX() != toX) {
//            robot.stepForward();
//        }
        checkRationalWay(robot, toX, toY);

        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        doStepsX(robot, toX);
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
        doStepsY(robot, toY);
    }

    private static void checkRationalWay(Robot robot, int toX, int toY) {
        if ((robot.getDirection() == Direction.UP) && (toY > robot.getY())) {
            doStepsY(robot, toY);
        } else if ((robot.getDirection() == Direction.DOWN) && (toY < robot.getY())) {
            doStepsY(robot, toY);
        } else if ((robot.getDirection() == Direction.LEFT) && (toX < robot.getX())) {
            doStepsX(robot, toX);
        } else if ((robot.getDirection() == Direction.RIGHT) && (toX > robot.getX())) {
            doStepsX(robot, toX);
        }
    }

    private static void doStepsY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void doStepsX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }
}
