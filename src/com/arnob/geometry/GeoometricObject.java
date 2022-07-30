package com.arnob.geometry;

public class GeoometricObject {
    public String color;
    public boolean filled;

    public GeoometricObject() {
        this.color = "red";
        this.filled = true;
    }

    public GeoometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeoometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
