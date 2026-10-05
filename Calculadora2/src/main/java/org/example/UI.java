package org.example;

public class UI {

    //Cabecera
    public static void printHeader(){
        IO.println("Bienvenido!");
    }

    //Request al usuario
    public static String printOperationRequest(){
        IO.println("¿Qué operación vas a realizar?");

        return Keyboard.readString();
    }

    //Pido el primer número al usuario
    public static double printFirstNumberRequest(){
        IO.println("Introduce el primer número");
        while(true) {
            String s = Keyboard.readString();
            if (Conversions.isReal(s))
                return Conversions.toReal(s);
            printFirstNumberRequest();
        }
    }

    //Pido el segundo número al usuario
    public static double printSecondNumberRequest() {
        IO.println("Introduce el segundo número");
        while (true) {
            String s = Keyboard.readString();
            //If option.equals("+-/*")
            if (Conversions.isReal(s))
                return Conversions.toReal(s);
            printSecondNumberRequest();

        }
    }
    //Muestre el resultado al usuario
    public static void printResult(double n1, double n2, String op , double result) {
        IO.println("El resultado es:" + result);

    }

    //Se despide
    public static void printBye() {
        IO.println("Adiós");
    }

}
