package com.teachmeskills.lesson7.Figure;

public class Main {
    public static void main (String [] args) {
        Figure[] figures = {new Rectangle(1,2),
                new Rectangle(2,4),
                new Triangle(3,4,5), new Circle(5),
                new Triangle(5,2,2)};
        for(Figure figure : figures){
            figure.calculateArea();
            figure.calculatePerimeter();
            System.out.println(figure);
        }
    }
}