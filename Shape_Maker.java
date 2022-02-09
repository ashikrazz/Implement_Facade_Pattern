package com.company;

public class Shape_Maker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    public Shape_Maker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void draw_Circle() {
        circle.draw();
    }
    public void draw_Rectangle() {
        rectangle.draw();
    }
    public void draw_Square() {
        square.draw();
    }
}
