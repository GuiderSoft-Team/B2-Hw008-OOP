public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.
        Point point=new Point(3,4);
        Point point2=new Point(6,8);
        Point point3=new Point(5,12);

        point.calculateDistance(point2);
        System.out.println(+point.calculateDistance(point2));

    }
}
