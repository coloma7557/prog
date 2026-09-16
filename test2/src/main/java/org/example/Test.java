package org.example;

public class Test {
    public static double calculate_imc(double weight, double height){
        double height2 = height * height;
        return weight / height2;
    }
    public static double calculateRectangleArea(double base, double height){
        return base * height;
    }
    public static double calculatePerimeterArea(double base, double height){

        return 2 * (base + height);
    }
    public static double calculateCircleArea(double radio){

        return Math.PI * (radio * radio);
    }
}

//Función que calcule el perímetro de un rectángulo