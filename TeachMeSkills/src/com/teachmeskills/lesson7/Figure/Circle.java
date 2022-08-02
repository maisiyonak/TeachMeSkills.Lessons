package com.teachmeskills.lesson7.Figure;

public class Circle extends Figure implements Calculable {
    private double radiusOfFigure;
    final double pi = 3.14;
    public double getRadiusOfFigure() {
        return radiusOfFigure;
    }
    public void setRadiusOfFigure(double radiusOfFigure) {
        this.radiusOfFigure = radiusOfFigure;
    }
    public double getPi() {
        return pi;
    }
    public Circle(double radiusOfFigure) {
        this.radiusOfFigure = radiusOfFigure;
    }
    @Override
    public void calculateArea() {
        setAreaOfFigure(pi * getRadiusOfFigure() * getRadiusOfFigure());
    }
    @Override
    public void calculatePerimeter() {
        setPerimeterOfFigure(2 * pi * getRadiusOfFigure());
    }
    public String toString() {
        return "Площадь круга S=" + getAreaOfFigure() + ", периметр P=" + getPerimeterOfFigure();
    }
}