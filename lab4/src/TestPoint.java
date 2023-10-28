public class TestPoint{
    public static void main(String[] args){
        Point myPoint =new Point(9,9);
        Point otherPoint =new Point(7,7);
        double distance =myPoint.distance(otherPoint);
        System.out.println("Odległość miedzy tymi punktami: "+distance);
    }
}
class Point{
    int x;
    int y;
    public Point(int x,int y) {
        this.x =x;
        this.y =y;
    }
    public double distance(Point otherPoint){
        int xroz = this.x -otherPoint.x;
        int yroz = this.y -otherPoint.y;
        return Math.sqrt(xroz*xroz + yroz*yroz);
    }
}
