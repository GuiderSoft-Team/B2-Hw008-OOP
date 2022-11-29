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

    public double calculateDistance(Point point){

        double distancePow=Math.pow((point.x-this.x),2)+Math.pow((point.y-this.y),2);

        return Math.sqrt(distancePow);
    }

   public double calculateDistance(int x, int y){

       double distancePow=Math.pow((x-this.x),2)+Math.pow((y-this.y),2);

       return Math.sqrt(distancePow);
   }

    @Override
    public String toString() {

        return "Point{"+ x +";"+ y +
                '}';
    }
}
