public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.

        Point p1 = new Point(1,2);
        Point p2 = new Point(2,3);
        Point p3 = new Point(8,4);
        System.out.println("distance (p1,p2):"+p1.calculateDistance(p2));
        System.out.println("distance [p3,(5,4)]:"+p3.calculateDistance(5,4));



    }
}
