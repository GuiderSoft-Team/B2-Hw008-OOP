import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Point p1 = new Point(10,4);
        Point p2 = new Point(-1,6);
        Point p3 = new Point(14,4);

        System.out.printf("%s'nin %s'ye uzaklığı: %5.2f\n",p1,p2,p1.calculateDistance(p2));
        System.out.printf("%s'nin [%d-%d] noktasına uzaklısı: %5.3f",p3,5,4,p3.calculateDistance(5, 4));



    }
}


