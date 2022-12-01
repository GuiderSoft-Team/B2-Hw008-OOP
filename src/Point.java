public class Point {
    private int x;

    private int y;

    private double distance;

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

        return (int) (distance = Math.sqrt(Math.pow((point.getX()) - (this.getX()), 2) + Math.pow((point.getY()
                - this.getY()), 2)));

    }
    public double calculateDistance(int x,int y){
        distance = Math.sqrt(Math.pow(x - (this.getX()), 2) + Math.pow(y - (this.getY()), 2));
        return (int)distance;
    }

    @Override
    public String toString() {
        return String.format("Point =(%d;%d)\n",x,y);
    }
}

