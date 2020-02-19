/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

import java.util.Arrays;

public class GeometricObjectRunner {

    public static void main(String[] args) {
        GeometricObject [] geoObjects = new GeometricObject[3]; //create an array of at least one Rec, Circle, and Triangle

        Triangle triangle = new Triangle(new Point (2,5), new Point (3,7), new Point (4,1));
        geoObjects [0] = triangle;

        Circle circle = new Circle( new Point(4,5), 8);
        geoObjects[1] = circle;

        Rectangle rectangle = new Rectangle(new Point(0,4), 4, 6);
        geoObjects[2] = rectangle;


        for(GeometricObject objects: geoObjects) {
            System.out.println(objects.toString());
        }

        Arrays.parallelSort(geoObjects);
        System.out.println("\nHere is our sorted array according to Arrays.parallelSort: ");

        for(GeometricObject objects: geoObjects) {
            System.out.println(objects.toString());
        }

        System.out.println("\nHere is our max object according to our findMax function:\n" +findMax(geoObjects));
    }

    static GeometricObject findMax(GeometricObject [] objects) {
        GeometricObject max = objects[0];

        for(int i = 0; i < objects.length; i++) {
            if(max.compareTo(max, objects[i]) == objects[i]) {
                max = objects[i];
            }
        }

        return max;
    }
}
