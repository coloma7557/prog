package org.example;


public class Test2 {

    //Función que devuelva un numero absoluto
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

    //Función que calcula una ecuación de segundo grado ax**2 +bx+c = 0

    public static double

}
//Valor absoluto de la resta de los 2
//Saturar (2, 7, 10) -> Devuelve 2 porque es menor
//Saturar (11, 7, 10) -> Devuelve 10 porque es mayor
//Saturar (8, 7, 10) -> Devuelve 8 porque está entre los 2
//Interpolo(7, 5, 10)
//Raiz cuadrada root = Math.sqrt()
//Devolver NaN si b es negativo o a es 0
