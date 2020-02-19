/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

public class GeometricObject implements Comparable<GeometricObject> {
    // creating an interface of Geometric Object
    // declaring Area, Perimeter and toString with no method body
    private double area, perimeter;
    public double getArea() {return area;};
    public double getPerimeter() {return perimeter;}
    //static GeometricObject(GeometricObject object, GeometricObject geometricObject);

    @Override
    public String toString() {
        return "Area: " + getArea() + " Perimeter: " + getPerimeter();
    }


    public static GeometricObject compareTo(GeometricObject obj1, GeometricObject obj2) {
           if(obj1.getArea() > obj2.getArea()) {
               return obj1;
           }
       return obj2;
    }

   @Override
   public int compareTo(GeometricObject obj) {
       return Double.compare(area, obj.getArea());
   }
}
