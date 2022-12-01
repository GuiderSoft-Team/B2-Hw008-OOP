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
    double calculateDistance (Point point){
        double quaddistance;
        double x1 = this.x;
        double x2 = point.getX();
        double y1 = this.y;
        double y2 = point.getY();
        quaddistance = Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        double distance = Math.sqrt(quaddistance);
        return distance;
    }
    double calculateDistance (int x, int y){
        double quaddistance;
        double x1 = this.x;
        double x2 = x;
        double y1 = this.y;
        double y2 = y;
        quaddistance = Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        double distance = Math.sqrt(quaddistance);
        return distance;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)",getX(),getY());
    }
}
