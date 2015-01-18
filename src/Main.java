import robot.RobotHelper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RobotHelper.mouseMove(10,10);
        RobotHelper.mouseMove(20,20);
        System.out.print(RobotHelper.getPixelColorHex(20, 20));
        System.out.print(Arrays.toString(RobotHelper.getPixelColorRGB(20, 20)));
        System.out.print(RobotHelper.getPixelColor(20, 20).getRGB());
        System.out.print(RobotHelper.isPixelColor(20, 20, 214, 204, 140, 10));

        color();
    }

    public static void color() {
        while (true) {
            RobotHelper.mouseMove(640, 512);
            RobotHelper.delay(100);
            for (int i = 0; i < 30; i++) {
                RobotHelper.delay(100);
                if (!RobotHelper.isPixelColor(640, 512, 0, 0, 0, 100)) {
                    RobotHelper.delay(200);
                    RobotHelper.mouseLeftClick();
                    RobotHelper.delay(30000);
                    RobotHelper.mouseMove(660, 970);
                    RobotHelper.mouseLeftClick();
                }
                System.out.println(RobotHelper.getPixelColorDec(640, 512));
            }
        }
    }
}
