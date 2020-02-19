/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

public class Triangle extends GeometricObject {

    private Point point1, point2, point3;


    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }


    @Override
    public double getArea() {

        double a = getDistance(point1, point2);  // length of first side
        double b = getDistance(point2, point3);  // length of second side
        double c = getDistance(point1, point3);  // length of third side

        double s = (a+b+c) / 2;

        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double getPerimeter() {
        return getDistance(point1, point2) + // length of first side
        getDistance(point2, point3) +// length of second side
        getDistance(point1, point3);
    }


    public double getDistance(Point Point1, Point Point2) {
        return Math.sqrt( (Math.pow((Point1.getX() - Point2.getX()), 2))
                + (Math.pow((Point1.getY() - Point2.getY()), 2)) );

    }

    @Override
    public String toString() {
        return "Triangle: " +"Area: " + getArea() + " Perimeter: " + getPerimeter();
    }


}
