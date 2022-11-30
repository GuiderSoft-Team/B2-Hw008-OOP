public class MainApp {
    public static void main(String[] args) {
        Point p1=new Point(6,2);
        Point p2=new Point(7,3);
        Point p3=new Point(8,4);
        System.out.printf("P1 ve P2 arasındaki mesafe = %5.2f \n",p1.calculateDistance(p2));
        System.out.println("P3 ve (5,4) arasındaki mesafe = "+p3.calculateDistance(5,4));
    }
}
