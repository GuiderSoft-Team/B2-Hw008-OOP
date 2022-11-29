public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.
        Point p1=new Point(3,4);
        Point p2=new Point(6,8);
        Point p3=new Point(5,12);


        p1.calculateDistance(p2);
        System.out.println("p1 and p2 distance = " + p1.calculateDistance(p2));
        System.out.println("p3 and (5,4) distance= " + p3.calculateDistance(5, 4));
    }

}
