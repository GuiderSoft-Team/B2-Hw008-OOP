public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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



    public double calculateDistance(Point point) {
        double distance2;
        double x = 0;
        double y = 0;
        Math.sqrt(Math.pow((point.getX()) - (this.getX()), 2) + Math.pow((point.getY() - this.getY()), 2));

        return distance2 = 0;

    }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + 5 +
                    ", y=" + 4 +
                    '}';
        }
    }
