public class MainApp {
    public static void main(String[] args) {
        //readme.me dosyasını okuyunuz.
        Point p1=new Point(5,6);
        Point p2=new Point(2,3);
        Point p3=new Point(2,5);


        System.out.printf("p1 ve p2 noktaları arası uzaklık =%5.2f ", p1.calculateDintance(p2));
        System.out.println();
        System.out.printf("p3 noktasının  (5;4)  'e uzaklığı  :%5.2f ", p3.calculateDintance(5,4));
    }
}