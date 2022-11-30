public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.

        Point p1=new Point(5,4);
        Point p2=new Point(9,5);
        Point p3=new Point(3,5);

        System.out.println("P1 ve P2 arasındaki uzaklık: "+p1.calculateDistance(p2));
        System.out.println();
        System.out.println("P3 ve {5,4} arasındaki uzaklık: "+p3.calculateDistance(5,4));



    }
}

