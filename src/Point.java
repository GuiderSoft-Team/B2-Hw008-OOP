public class Point {

    private int x;

    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(Point point) {

        return Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2));
    }

    public double calculateDistance(Point point, int x, int y){

        return Math.sqrt(Math.pow(getX()-x,2)+Math.pow(getY()-y,2));
    }

    public double calculateDistance(Point p1, Point p2) {

        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return String.format("Point (%d,%d)", x, y);
    }
}
