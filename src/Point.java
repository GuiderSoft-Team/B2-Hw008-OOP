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

    public double calculateDintance(Point point){
        return Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
    }

    public double calculateDintance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

    }

    @Override
    public String toString() {
        return "Point ("  + x + ";" + y + ')';
    }

}
