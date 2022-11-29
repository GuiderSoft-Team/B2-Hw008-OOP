public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        double uzaklik1 = p1.calculateDistance(p2);
        System.out.printf("%s ve %s noktalari arasindaki uzaklik = %5.2f\n", p1, p2, uzaklik1);

        Point p3 = new Point(3, 6);
        double uzaklik2 = p3.calculateDistance(5,4);
        System.out.printf("%s ve Point (5;4) noktalari arasindaki uzaklik = %5.2f\n", p3, uzaklik2);
    }
}
