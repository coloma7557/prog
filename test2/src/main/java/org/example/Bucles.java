package org.example;

//While(condicion){}
//Función que recibe un número e imprime hola tantas veces como sea el numero

public class Bucles {

    public static void printNumber(int a){
        int i = 0;
        while(i <= a) {
            IO.println("Hola");
            i++;
        }
    }

    //Funcion que le paso un numero y me imprime por pantalla todos los numeros

    public static void recursive(int n){
        int i = 0;
        while(i < n){
            IO.println(i);
            i++;
        }
    }

    public static void recursiveReves(int n){
        int i = 0;
        while(i >= n){
            IO.println(i);
            n--;
        }
    }
//Serie 2
    public static void recursiveDoble(int n){
        int i = 0;
        while(i < n){
            IO.println(i);
            i = i + 2;
            n = n + 1;
        }
    }
//Serie 3
    public static void recursiveTres(int n){
        int i = 0;
        while(i < n){
            IO.println(i);
            i =
        }
    }

}
