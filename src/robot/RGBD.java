package robot;

/**
 * Created by Андрей on 30.01.15.
 */
public class RGBD {
    public int r;
    public int g;
    public int b;
    public int d;

    public RGBD(int r, int g, int b, int d) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.d = d;
    }

    public RGBD(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
