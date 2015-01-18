import robot.RobotHelper;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        RobotHelper.mouseMove(10,10);
        RobotHelper.mouseMove(20,20);
        System.out.println(RobotHelper.getPixelColorHex(20, 20));
        System.out.println(Arrays.toString(RobotHelper.getPixelColorRGB(20, 20)));
        System.out.println(RobotHelper.getPixelColor(20, 20).getRGB());
        System.out.println(RobotHelper.isPixelColor(20, 20, 214, 204, 140, 10));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.height);
        System.out.println(screenSize.width);
*/

        color();
    }

    public static void color() {
        int senterX = RobotHelper.getScrenSize().width / 2;
        int senterY = RobotHelper.getScrenSize().height / 2;
        int buttonX = senterY - 142;
        int buttonY = RobotHelper.getScrenSize().height - 68;


        while (true) {
            RobotHelper.mouseMove(senterX, senterY);
            for (int i = 0; i < 30; i++) {
                RobotHelper.delay(100);
                if (!RobotHelper.isPixelColor(senterX, senterX, 0, 0, 0, 100)) {
                    RobotHelper.delay(200);
                    RobotHelper.mouseLeftClick();
                    RobotHelper.delay(25000, 30000);
                    RobotHelper.mouseMove(buttonX, buttonY);
                    RobotHelper.mouseLeftClick();
                }
            }
        }
    }
}
