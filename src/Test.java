import robot.RobotHelper;

/**
 * Created by Андрей on 30.01.15.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(RobotHelper.getPixelColorDec(Main.but3X, Main.but3Y));
        RobotHelper.mouseMove(Main.but3X, Main.but3Y);
    }
}
