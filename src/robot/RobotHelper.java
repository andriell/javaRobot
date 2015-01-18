package robot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

/**
 * Created by Андрей on 18.01.15.
 */
public class RobotHelper {
    private static Robot robot;
    private static Dimension dimension;

    private RobotHelper() {}

    public static synchronized Robot robot() {
        if (robot == null) {
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
            GraphicsDevice screen = env.getDefaultScreenDevice();
            try {
                robot = new Robot(screen);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
        return robot;
    }

    public static void delay(int ms) {
        robot.delay(ms);
    }

    public static void delay(int msMin, int msMax) {
        robot.delay(msMin + (int)(Math.random() * ((msMin - msMin) + 1)));
    }

    public static void mouseMove(int x, int y) {
        robot().mouseMove(x, y);
        robot.delay(100);
    }

    public static void mouseLeftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(300);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(100);
    }

    public static void keyPress(int keycode) {
        robot.keyPress(keycode);
        robot.delay(300);
        robot.keyRelease(keycode);
        robot.delay(100);
    }

    public static Color getPixelColor(int x, int y) {
        return robot().getPixelColor(x, y);
    }

    public static String getPixelColorDec(int x, int y) {
        Color color = getPixelColor(x, y);
        return String.format("%d %d %d", color.getRed(), color.getGreen(), color.getBlue()).toUpperCase();
    }

    public static String getPixelColorHex(int x, int y) {
        Color color = getPixelColor(x, y);
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    public static int[] getPixelColorRGB(int x, int y) {
        Color color = getPixelColor(x, y);
        int[] r = new int[3];
        r[0] = color.getRed();
        r[1] = color.getGreen();
        r[2] = color.getBlue();
        return r;
    }

    public static boolean isPixelColor(int x, int y, int r, int g, int b, int delta) {
        Color color = getPixelColor(x, y);
        return Math.abs(color.getRed() - r) + Math.abs(color.getGreen() - g) + Math.abs(color.getBlue() - b) <= delta;
    }

    public static Dimension getScrenSize() {
        if (dimension == null) {
            dimension = Toolkit.getDefaultToolkit().getScreenSize();
        }
        return dimension;
    }
}
