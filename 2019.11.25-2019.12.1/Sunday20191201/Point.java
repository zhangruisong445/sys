package Sunday20191201;

public class Point {

    private int x;
    private int y;

    protected void movePoint(int x,int y){
        this.x=x;
        this.y=y;

    }


    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
