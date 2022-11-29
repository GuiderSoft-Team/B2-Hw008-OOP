public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.

        Point p1=new Point(2,4);
        Point p2=new Point(9,8);
        Point p3=new Point();
        p3.setX(5);
        p3.setY(3);

        System.out.printf("P1 ile P2 arasındaki mesafe: %5.2f \n ",p1.calculateDistance(p2));
        System.out.println("P3 ile (5,4) değerlerinin mesafesi: " +p3.calculateDistance(5,4));
    }
}
