public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateDistance(Point p) {

        return Math.round(Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
                + (this.getY() - p.getY()) * (this.getY() - p.getY()))*100) / 100.0;
    }

    public double calculateDistance(int x, int y) {
        return Math.round(Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) *100)/100.0;
    }

    @Override
    public String toString() {
        return "Point ("  + x +
                ";" + y +
                ')';
    }

}


