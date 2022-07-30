package com.arnob.geometry;

public class Rectangle extends GeoometricObject{
    private double width;
    private double heigth;

    public Rectangle( ) {
        this.width = 3.0;
        this.heigth = 6.0;
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getPerimeeter() {
        double pm=2* (width+heigth);
        return pm;
    }
    public double getDiagonal() {
        double dm=(Math.sqrt(width*width+heigth*heigth));
        return dm;
    }
    public double getArea() {
        double area= width*heigth;
        return area;
    }


    public String PrintRectangle() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Perimeter=" + getPerimeeter() +
                ", Diameter='" + getDiagonal() + '\'' +
                ", Area=" + getArea() +
                '}';
    }
}
