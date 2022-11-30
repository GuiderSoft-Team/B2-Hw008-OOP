public class MainApp {
    public static void main(String[] args) {

        Point p1 = new Point(3, 4);

        Point p2 = new Point(8, 16);

        Point p3 = new Point();
        p3.setX(12);
        p3.setY(28);

        System.out.println("p3 noktası : " + p3);

        System.out.printf("p3 ile (5,4) noktaları arası mesafe: %5.2f\n", p3.calculateDistance(p3, 5, 4));

        System.out.printf("p1 ve p2 noktaları arası mesafe: %5.2f\n", p1.calculateDistance(p1, p2));

    }
}
