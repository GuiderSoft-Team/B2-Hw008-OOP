public class MainApp {
    public static void main(String[] args) {

        Point p1=new Point(15,21);
        Point p2=new Point(156,293);
        Point p3=new Point(67,33);

        p1.calculateDistance(p2);
        System.out.println("Distance [p1-p2] = "+Math.round(p1.calculateDistance(p2)));
        System.out.println();
        System.out.println("Distance [p3 and x=5,y=4] = "+Math.round(p3.calculateDistance(5,4)));





    }
}
