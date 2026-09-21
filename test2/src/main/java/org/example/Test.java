package org.example;

public class Test {
    public static double calculate_imc(double weight, double height) {
        double height2 = height * height;
        return weight / height2;
    }

    public static double calculateRectangleArea(double base, double height) {

        return base * height;
    }

    public static double calculatePerimeterArea(double base, double height) {

        return 2 * (base + height);
    }

    public static double calculateCircleArea(double radio) {

        return Math.PI * (radio * radio);
    }

    public static String mayor18(int edad) {
        if (edad <= 17) {
            return "Es menor de edad";
        } else {
            return "Es mayor de edad";
        }
    }

    public static String EsAlto(double altura) {
        if (altura <= 1.50) {
            return "Es bajo";
        } else {
            return "Es Alto";
        }
    }

    public static Boolean EsBisiesto(int dias) {
        if (dias == 366)
            return true;
        return false;
    }

    public static double getMinior(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }

    public static int getMinior2(int num1, int num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    public static int getMinior3(int a, int b, int c){
        return getMinior2(a, getMinior2(b, c));
    }

    public static double getMinior3(double num1, double num2) {
        double result;
        if (num1 < num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public static int getHigher(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static int getMayor(int a,int b, int c){
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static int getMaior(int a, int b, int c){
        int result = a;
        if (b > result)
            result = b;
        if (c > result)
            result = c;
        return result;
    }

}



