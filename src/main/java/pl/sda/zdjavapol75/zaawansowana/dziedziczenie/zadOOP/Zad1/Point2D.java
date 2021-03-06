package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.zadOOP.Zad1;

public class Point2D {
    // podpunkt 1
    protected float x;
    protected float y;

    // podpunkt 2
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    // podpunkt 3
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // podpunkt 4
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // podpunkt 5
    public float[] getXY() {
        return new float[]{x,y};
    }

    // podpunkt 6
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // podpunkt 7

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // podpunkt 8
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
