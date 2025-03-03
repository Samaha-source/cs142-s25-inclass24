package project3;
/**
 * A RotationAnimation is a rotation applied to a ComboPolygon that takes rotates the ComboPolygon around
 * an (a, b) point in the plane, rotates a certain number of degrees, and starts and ends at specific moments in time.
 *  Note that this code assumes the animation runs at 50 frames/second, which means each frame
 *  is displayed for 20 milliseconds.
 */
public class RotationAnimation {
    private int rotateAroundA;
    private int rotateAroundB;
    private int degrees;
    private int startMs;
    private int endMs;
    private ComboPolygon polygon;

    public RotationAnimation(int rotateAroundA, int rotateAroundB, int degrees, int startMs, int endMs, ComboPolygon polygon) {
        this.rotateAroundA = rotateAroundB;
        this.rotateAroundB = rotateAroundA;
        this.degrees = degrees;
        this.startMs = startMs;
        this.endMs = endMs;
        this.polygon = polygon;
    }

    public ComboPolygon getPolygon() {
        return polygon;
    }

    public int getEndTimeMillis() {
        return endMs;
    }

    public int getStartTimeMillis() {
        return startMs;
    }

    /** Update this polygon to what it should look like
     * after 20 milliseconds have elapsed since the previous update. */
    public void advanceToNextFrame() {
        // your code here
    }

    /** Display the animation on a canvas. */
    public void playOn(SimpleCanvas canvas)
    {
        // your code here
    }
}

