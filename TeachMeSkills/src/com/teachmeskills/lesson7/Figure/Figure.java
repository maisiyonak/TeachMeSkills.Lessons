package com.teachmeskills.lesson7.Figure;

public abstract class Figure implements Calculable {
    private double sideFirstOfFigure;
    private double sideSecondOfFigure;
    private double sideThirstOfFigure;
    private double perimeterOfFigure;
    private double areaOfFigure;
    public Figure() {
    }
    public Figure(double sideFirstOfFigure, double sideSecondOfFigure) {
        this.sideFirstOfFigure = sideFirstOfFigure;
        this.sideSecondOfFigure = sideSecondOfFigure;
    }
    public Figure(double sideFirstOfFigure, double sideSecondOfFigure, double sideThirstOfFigure) {
        this.sideFirstOfFigure = sideFirstOfFigure;
        this.sideSecondOfFigure = sideSecondOfFigure;
        this.sideThirstOfFigure = sideThirstOfFigure;
    }
    public double getPerimeterOfFigure() {
        return perimeterOfFigure;
    }
    public void setPerimeterOfFigure(double perimeterOfFigure) {
        this.perimeterOfFigure = perimeterOfFigure;
    }
    public double getAreaOfFigure() {
        return areaOfFigure;
    }
    public void setAreaOfFigure(double areaOfFigure) {
        this.areaOfFigure = areaOfFigure;
    }
    public double getSideFirstOfFigure() {
        return sideFirstOfFigure;
    }
    public void setSideFirstOfFigure(double sideFirstOfFigure) {
        this.sideFirstOfFigure = sideFirstOfFigure;
    }
    public double getSideSecondOfFigure() {
        return sideSecondOfFigure;
    }
    public void setSideSecondOfFigure(double sideSecondOfFigure) {
        this.sideSecondOfFigure = sideSecondOfFigure;
    }
    public double getSideThirstOfFigure() {
        return sideThirstOfFigure;
    }
    public void setSideThirstOfFigure(double sideThirstOfFigure) {
        this.sideThirstOfFigure = sideThirstOfFigure;
    }
}