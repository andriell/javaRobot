import robot.RobotHelper;
import robot.XY;

public class Main {
    static int borderTop = 85;
    static int borderRight = 72;
    static int borderBottom = 23;
    static int borderLeft = 0;

    static int centerX;
    static int centerY;

    static int but1X;
    static int but1Y;

    static int but2X;
    static int but2Y;

    static int but3X;
    static int but3Y;

    static int but4X;
    static int but4Y;

    static int butFlot1X;
    static int butFlot1Y;

    static int butFlot2X;
    static int butFlot2Y;

    static int position1X;
    static int position1Y;

    static int position2X;
    static int position2Y;

    static {
        centerX = (RobotHelper.getScrenSize().width - borderRight - borderLeft) / 2;
        centerY = (RobotHelper.getScrenSize().height - borderTop - borderBottom) / 2;

        // 96 * 1.5 = 144
        but1X = centerX - 144;
        but1Y = RobotHelper.getScrenSize().height - 68 - borderBottom;
        but2X = but1X + 96;
        but2Y = but1Y;
        but3X = but2X + 96;
        but3Y = but1Y;
        but4X = but3X + 96;
        but4Y = but1Y;

        butFlot1X = 1596;
        butFlot1Y = 536;

        butFlot2X = butFlot1X;
        butFlot2Y = butFlot1Y + 44;

        position1X = centerX + 150;
        position1Y = centerY;

        position2X = centerX + 300;
        position2Y = centerY;
    }


    public static void main(String[] args) {
        RobotHelper.delay(5000);
        //testPosition();
        run();
    }

    public static void run2() {
        while (true) {
            clickFlot1();
            waitRepair();
            clickCenter();

            selectEnemy2();
            clickBut1(); // атака
            waitBattle1Complite();
            clickFlot1();
            RobotHelper.delay(2000);
            clickBut3(); // отзыв

            clickBut1(); // атака
            waitBeforeBatleStart();
            waitBattle1Complite();
            clickFlot1();
            RobotHelper.delay(2000);
            clickBut3(); // отзыв
            waitTeleport();
            clickFlot2();
            RobotHelper.delay(2000);
            //clickBut3(); // быстро
            clickBut4(); // отмена
            RobotHelper.delay(2000);
            clickFlot1();
            RobotHelper.delay(2000);
            clickBut4(); // ремонт
            RobotHelper.delay(2000);

            clickFlot2();
            selectEnemy();
            waitBeforeAttack();
            clickBut1(); // атака
            waitBeforeBatleStart();
            waitBattle2Complite();
            clickFlot2();
            RobotHelper.delay(2000);
            clickBut3(); // отзыв
            waitTeleport();
            clickFlot1();
            RobotHelper.delay(2000);
            //clickBut3(); // быстро
            clickBut4(); // отмена
            RobotHelper.delay(2000);
            clickFlot2();
            RobotHelper.delay(2000);
            clickBut4(); // ремонт
            RobotHelper.delay(2000);
        }
    }


    public static void run() {
        while (true) {
            clickFlot1();
            selectEnemy();
            waitBeforeAttack();
            clickBut1(); // атака
            waitBeforeBatleStart();
            waitBattle1Complite();
            clickFlot1();
            RobotHelper.delay(2000);
            clickBut3(); // отзыв
            waitTeleport();
            clickFlot2();
            RobotHelper.delay(2000);
            //clickBut3(); // быстро
            clickBut4(); // отмена
            RobotHelper.delay(2000);
            clickFlot1();
            RobotHelper.delay(2000);
            clickBut4(); // ремонт
            RobotHelper.delay(2000);

            clickFlot2();
            selectEnemy();
            waitBeforeAttack();
            clickBut1(); // атака
            waitBeforeBatleStart();
            waitBattle2Complite();
            clickFlot2();
            RobotHelper.delay(2000);
            clickBut3(); // отзыв
            waitTeleport();
            clickFlot1();
            RobotHelper.delay(2000);
            //clickBut3(); // быстро
            clickBut4(); // отмена
            RobotHelper.delay(2000);
            clickFlot2();
            RobotHelper.delay(2000);
            clickBut4(); // ремонт
            RobotHelper.delay(2000);
        }
    }

    public static void testPosition() {
        RobotHelper.mouseMove(centerX, centerY);
        RobotHelper.delay(2000);

        RobotHelper.mouseMove(but1X, but1Y);
        RobotHelper.delay(2000);
        RobotHelper.mouseMove(but2X, but2Y);
        RobotHelper.delay(2000);
        RobotHelper.mouseMove(but3X, but3Y);
        RobotHelper.delay(2000);
        RobotHelper.mouseMove(but4X, but4Y);
        RobotHelper.delay(2000);

        RobotHelper.mouseMove(butFlot1X, butFlot1Y);
        RobotHelper.delay(2000);
        RobotHelper.mouseMove(butFlot2X, butFlot2Y);
        RobotHelper.delay(2000);

        RobotHelper.mouseMove(centerX, centerY);
        RobotHelper.delay(2000);

        RobotHelper.mouseMove(position1X, position1Y);
        RobotHelper.delay(2000);
        RobotHelper.mouseMove(position2X, position2Y);
        RobotHelper.delay(2000);

        RobotHelper.mouseMove(centerX, centerY);
        RobotHelper.delay(2000);
    }

    public static void clickFlot1() {
        RobotHelper.mouseLeftClick(butFlot1X, butFlot1Y);
    }

    public static void clickFlot2() {
        RobotHelper.mouseLeftClick(butFlot2X, butFlot2Y);
    }

    public static void clickCenter() {
        RobotHelper.mouseLeftClick(centerX, centerY);
    }

    public static void clickPosition1() {
        RobotHelper.mouseLeftClick(position1X, position1Y);
    }

    public static void clickPosition2() {
        RobotHelper.mouseLeftClick(position2X, position2Y);
    }

    // Атака, Управление
    public static void clickBut1() {
        RobotHelper.mouseLeftClick(but1X, but1Y);
    }
    // Быстро, телепорт
    public static void clickBut2() {
        RobotHelper.mouseLeftClick(but2X, but2Y);
    }

    // Быстро, отозвать
    public static void clickBut3() {
        RobotHelper.mouseLeftClick(but3X, but3Y);
    }

    // Ремонт, отмена ремонта
    public static void clickBut4() {
        RobotHelper.mouseLeftClick(but4X, but4Y);
    }

    public static void selectEnemy() {
        while (true) {
            if (RobotHelper.isPixelColor(centerX, centerY, 128, 65, 60, 100)) {
                break;
            }
            RobotHelper.delay(200);
        }
        RobotHelper.delay(100);
        RobotHelper.mouseLeftClick(centerX, centerY);
    }

    public static void selectEnemy2() {
        int x1 = centerX - centerX / 2;
        int y1 = centerY - centerY / 2;

        int x2 = centerX + centerX / 2;
        int y2 = centerY + centerY / 2;

        while (true) {
            XY xy = RobotHelper.getColorXY(x1, y1, x2, y2, 85, 88, 101, 10);
            //RobotHelper.getColorXY(x1, y1, x2, y2, 63, 65, 76, 10);
            if (xy != null) {
                RobotHelper.mouseLeftClick(xy.x, xy.y);
                return;
            }
            RobotHelper.delay(2000);
        }
    }

    // во время боя 217,179,179
    public static void waitBattle1Complite() {
        RobotHelper.delay(50000);
        RobotHelper.delay(50000);
        RobotHelper.delay(50000);
        RobotHelper.delay(50000);
        RobotHelper.delay(50000);
    }

    public static void waitBattle2Complite() {
        RobotHelper.delay(50000);
        RobotHelper.delay(50000);
    }

    public static void waitBeforeAttack() {
        RobotHelper.delay(1000, 3000);
    }

    // Ждать пока не начнется битва после нажатия на кнопку бой
    public static void waitBeforeBatleStart() {
        RobotHelper.delay(40000);
    }

    public static void waitTeleport() {
        RobotHelper.delay(15000);
    }

    // Ждать пока ремонт закончится
    public static void waitRepair() {
        while (true) {
            if (!isRepair()) {
                break;
            }
            RobotHelper.delay(1000);
        }
    }
    // Ремонт идет
    public static boolean isRepair() {
        return RobotHelper.isPixelColor(but3X, but3Y, 103, 92, 69, 50);
    }
}
