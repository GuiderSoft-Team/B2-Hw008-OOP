public class MainApp {
    public static void main(String[] args) {
      Point p1= new Point(9,3);
      Point p2= new Point(5,4);
      Point p3= new Point(6,1);

        System.out.println("p1 ve p2 arasındaki mesafe "+p1.calculateDistance(p2));
        System.out.println("p3 ile 5 ve 4 değerlerinin mesafesi "+p3.calculateDistance(5,4));
    }
}
