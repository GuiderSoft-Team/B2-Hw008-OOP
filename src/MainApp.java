public class MainApp {
    public static void main(String[] args) {
      Point p1=new Point(9,7);
      Point p2=new Point(6,5);
      Point p3=new Point(8,6);
        System.out.printf("P1 ile P2 arasındaki mesafe: %5.2f \n",p1.calculateDistance(p2));
        System.out.printf("P3 ile (5;4) arasındaki mesafe: %5.2f",p3.calculateDistance(5,4));


    }
}
