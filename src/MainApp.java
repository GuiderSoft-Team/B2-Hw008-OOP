public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.
        Point p1=new Point(7,8);
        Point p2=new Point(8,9);
        Point p3=new Point(11,13);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.printf("P1 nesnesinin P2 nesnesine uyakligi = %5.2f",p1.calculateDistance(p2));
        System.out.println();
        System.out.printf("P3 nesnesinin X=5 ve Y=4 e uzakligi = %5.2f ",p3.calculateDistance(5,4));

    }
}
