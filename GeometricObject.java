import java.util.*;
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    /* Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    /* Return color */
    public String getColor() {
        return color;
    }
    /* Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    /* Set a new filled */
public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /* Get dateCreated */
    public java.util.Date getDateCreated;
    {
    }
    /* Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " +
                color + " and filled: " + filled;
    }
    /* Abstract method getArea */
    public abstract double getArea();
    /* Abstract method getPerimeter */
    public abstract double getPerimeter();
}
class Rectangle1 extends GeometricObject {
    private double width;
    private double height;
    public Rectangle1() {
    }
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /* Return width */
    public double getWidth() {
        return width;
    }
    /* Set a new width */
    public void setWidth(double width) {
        this.width = width;}
    /* Return height */
    public double getHeight() {
        return height;
    }
    /* Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }
    /* Return area */
    public double getArea() {
        return width * height;
    }
    /* Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
class Circle extends GeometricObject {
    private double radius;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    /* Return radius */
    public double getRadius() {
        return radius;
    }
    /* Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /* Return diameter */
    public double getDiameter() {return 2 * radius;
    }
    /* Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /* Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + " and the radius is " + radius);
    }
}