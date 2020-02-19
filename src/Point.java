/**
 * Justin Girgis
 * Serenity Brown
 * CECS 277
 * Project: IPI
 * February 18, 2020
 */

class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(double xPoint, double yPoint){
       return Math.sqrt( (Math.pow((xPoint - x), 2)) + (Math.pow((yPoint - y), 2)) );
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    @Override
    public String toString(){
        return "Point- X: " + x + " Y: " + y;
    }

}
