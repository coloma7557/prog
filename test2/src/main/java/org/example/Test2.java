package org.example;


public class Test2 {

    //Función que devuelva un numero absoluto //Valor absoluto de la resta de los 2
    public static double getAbsolute (double num){
        if (num < 0)
            return -num;
        return num;
    }


    // Funcion que me diga la distancia entre 2 numeros

    public static double getDistance (double num1, double num2){
        double distance = getAbsolute(num1 - num2);
        return distance;
    }

    //Saturar (2, 7, 10) -> Devuelve 2 porque es menor
    //Saturar (11, 7, 10) -> Devuelve 10 porque es mayor
    //Saturar (8, 7, 10) -> Devuelve 8 porque está entre los 2
    public static double satura(double value, double min, double max){
        if(value < min)
            return min;
        else if(value > max)
            return max;
        return value;
    }
    public static double getInterpol(double value, double min, double max){

        return min + (max - min) * value;
    }

    //Función que me resuelva una ecuación de segundo grado. Ej: ax**2 + bx +c = 0
    public static double resolveEquation(double a, double b, double c, boolean t){
        if (a == 0)
            return Double.NaN;
        double b2 = b * b;
        double ac = 4 * (a * c);
        double abc = b2 - ac;
        if (abc < 0)
            return Double.NaN;
        double root = Math.sqrt(abc);
        if(t)
            return (-b + root) / (2*a);
        return (-b - root) / (2*a);
    }
}

//Interpolo(7, 5, 10)
//Raiz cuadrada root = Math.sqrt()
//Devolver NaN si b es negativo o a es 0
