package robot;

public class Solution {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 9, Direction.RIGHT);
        Robot.moveRobot(robot, 0, 8);
    }
}
