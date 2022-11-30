public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point() {
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

    public double calculateDistance(Point point){
        double distance=Math.sqrt(Math.pow((point.getX())-(this.getX()),2)+Math.pow((point.getY()-(this.getY())),2));
        return distance;
    }
    public double calculateDistance(int x,int y){
        double distance=Math.sqrt(Math.pow((x)-(this.getX()),2)+Math.pow((y)-(this.getY()),2));
        return distance;
    }

    @Override
    public String toString() {
        return String.format("Point (%d,%d)",x,y);
    }
}
