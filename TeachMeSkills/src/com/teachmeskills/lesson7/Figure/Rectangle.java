package com.teachmeskills.lesson7.Figure;

public class Rectangle extends Figure implements Calculable {
    public Rectangle(double sideFirstOfFigure, double sideSecondOfFigure) {
        super(sideFirstOfFigure, sideSecondOfFigure);
    }
    @Override
    public void calculateArea() {
        setAreaOfFigure(getSideFirstOfFigure() * getSideSecondOfFigure());
    }
    @Override
    public void calculatePerimeter() {
        setPerimeterOfFigure(getSideFirstOfFigure() * 2 + getSideSecondOfFigure() * 2);
    }
    public String toString() {
        return "Площадь прямоугольника S=" + getAreaOfFigure() + ", периметр P=" + getPerimeterOfFigure();
    }
}
