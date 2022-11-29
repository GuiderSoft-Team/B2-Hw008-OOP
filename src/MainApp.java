public class MainApp {
    public static void main(String[] args) {
        Point p1 = new Point(7,8);
        Point p2 = new Point(4,6);
        Point p3 = new Point(2,5);
        System.out.println( p1 + "'in " + p2 + "'ye uzaklığı = " +p1.calculateDistance(p2));
        System.out.println( p3 + "'in " + "(5;4)" + "'ye uzaklığı = " +p1.calculateDistance(5, 4));


    }
}
