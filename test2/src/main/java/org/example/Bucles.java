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
        int num = 0;
        while(i < n){
            IO.println(num);
            num += 2;
            i++;
        }
    }
//Serie 3
    public static void recursiveTres(int num) {
        int i = 0;
        int n = 0;
        int signo = 1;

        while (i < num) {
            IO.println(n);
            i++;
            n = i * 3 * signo;
            signo = -signo;
        }
    }

    //Serie 4, saque por pantalla 2-4-8-16
    public static void recursiveCuatro(int num){
        int i = 0;
        int n = 1;
        while(i < num){
            IO.println(n);
            n = n * 2;
            i++;
        }
    }
//Si es impar lo *3+1. Si es par%2
    public static boolean esPar(int num1){
        return num1 % 2 == 0;
    }


    public static void collatz(int num){
        IO.println(num);
        while(num > 1){
            if(esPar(num)){
                num = num / 2;
                IO.println(num);
            }
            else{
                num = num * 3 + 1;
                IO.println(num);
            }
        }
    }

    //Fibonacci 0,1. 0+1 = 1 1+1 = 2 1+2 = 3
    public static void fibonacci(int n){
        int i = 0;
        int num1 = 0;
        int num2 = 1;
        IO.println(num1);
        IO.println(num2);

        if(n <= 0)
            IO.println(0);
            return;
        else if(n == 1)
            IO.println(1);

        else{
        while(i < n) {
            int total = num1 + num2;
            num1 = num2;
            num2 = total;
            i++;
        }
        }


    }
}

