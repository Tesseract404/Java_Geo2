package com.arnob.geometry;

public class Circle extends GeoometricObject {
    private double radious;

    public Circle() {
        this.radious = 6.0;
    }
    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle (String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getPerimeeter() {
        double pm=2*Math.PI*radious;
        return pm;
    }
    public double getDiameeter() {
        double dm=2*radious*radious;
        return dm;
    }
    public double getArea() {
        double area= Math.PI*radious*radious;
        return area;
    }


    public String PrintCircle() {
        return "Circle{" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Perimeter=" + getPerimeeter() +
                ", Diameter='" + getDiameeter() + '\'' +
                ", Area=" + getArea() +
                '}';
    }
}
