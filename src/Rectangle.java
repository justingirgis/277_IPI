/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

public class Rectangle extends GeometricObject {
    double width;
    double length;
    Point point;

    public Rectangle(Point leftCorner, double width, double length){
        this.length = length;
        this.width = width;
        this.point = leftCorner;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public double getPerimeter() {
        return ((2 * width) + (2 * length));
    }

    public double getDistance(Point leftCorner) {
        // x and y are our original points
        // x1 and y1 are some different points
         return Math.sqrt( (Math.pow((point.getX() - leftCorner.getX()), 2)) +
                 (Math.pow((point.getY() - leftCorner.getY()), 2)) );
    }

    public double getX() {
        return point.getX();
    }

    public double getY() {
        return point.getY();
    }

    @Override
    public String toString() {
        return "Rectangle: " + "Upper left corner at Point X:" + point.getX() + " Y:" + point.getY() +
                " Width: "+ getWidth() + " Length: " + getLength() +
                " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
