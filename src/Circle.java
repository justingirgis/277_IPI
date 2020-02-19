/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

public class Circle extends GeometricObject {

    double radius;
    Point center;

    // the circle contains centerPoint, radius, area, and perimeter
    // last two being inherited from the GeometricObject class
    public Circle(Point center, double radius){
        // take constructor and have it be used throughout program
        this.center = center;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getPerimeter() {
        // also known as circumference
        return 2 * 3.14 * getRadius();
    }

    @Override
    public double getArea(){
         ///returns 2 * pi * r squared
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public double getDistance(Point newPoint) {
        // taking in a point that I don't know (implicit)
        // finding distance of a point that I know (explicit)

        return Math.sqrt( (Math.pow((newPoint.getX() - center.getX()), 2))
                + (Math.pow((newPoint.getY() - center.getY()), 2)) );
    }

    public double getX() {
        return center.getX();
    }

    public double getY() {
        return center.getY();
    }

    @Override
    public String toString() {
        return ("Circle: Center at " + "Point X:" + center.getX() + " Y:" + center.getY() +
                " Radius: " + getRadius() + " Area: " + getArea() +
                " Perimeter: " + getPerimeter());
    }

    /*
    @Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
