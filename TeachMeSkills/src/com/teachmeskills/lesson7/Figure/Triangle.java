package com.teachmeskills.lesson7.Figure;

public class Triangle extends Figure implements Calculable {
    public Triangle(double sideFirstOfFigure, double sideSecondOfFigure, double sideThirstOfFigure) {
        super(sideFirstOfFigure, sideSecondOfFigure, sideThirstOfFigure);
    }
    @Override
    public void calculateArea() {
        setAreaOfFigure(Math.sqrt((getSideFirstOfFigure() + getSideSecondOfFigure() + getSideThirstOfFigure()) / 2 *
                ((getSideFirstOfFigure() + getSideSecondOfFigure() + getSideThirstOfFigure()) / 2 -
                getSideFirstOfFigure()) * ((getSideFirstOfFigure() + getSideSecondOfFigure() +
                getSideThirstOfFigure()) / 2 - getSideSecondOfFigure()) * ((getSideFirstOfFigure() +
                getSideSecondOfFigure() + getSideThirstOfFigure()) / 2 - getSideThirstOfFigure())));
    }
    @Override
    public void calculatePerimeter() {
        setPerimeterOfFigure(getSideFirstOfFigure() + getSideSecondOfFigure() + getSideThirstOfFigure());
    }
    public String toString() {
        if((getSideFirstOfFigure() + getSideSecondOfFigure()) <= getSideThirstOfFigure() ||
                (getSideFirstOfFigure() + getSideThirstOfFigure()) <= getSideSecondOfFigure() ||
                (getSideThirstOfFigure() + getSideSecondOfFigure()) <= getSideFirstOfFigure()) {
            return "Стороны треугольника не соответствуют действительности";
        } else {
            return "Площадь треугольника S=" + getAreaOfFigure() + ", периметр P=" + getPerimeterOfFigure();
        }
    }
}