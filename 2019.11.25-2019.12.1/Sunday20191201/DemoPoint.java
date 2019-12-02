package Sunday20191201;

public class DemoPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("======================");

        p1.movePoint(3,2);
        p2.movePoint(5,4);
        System.out.println(p1);
        System.out.println(p2);

    }
}
