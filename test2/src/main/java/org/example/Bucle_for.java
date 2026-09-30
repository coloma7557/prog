package org.example;

public class Bucle_for {

    //Sumatorio de un número EJ: 10. 1+2+3+4...+10

    public static int getSumatory(int n) {
        int result = 0;

        for(int i = 0; i < n; i++){
            result += 1;
            result += i;
        }
        return result;
    }

    public static int getProductory(int n){
        int result = 0;

        for(int i = 0; i < n; i++){
            result += 1;
            result *= i;
        }
        return result;
    }

    public static int getSumatory2(int n){
        if(n < 0)
            return 0;
        return n + getSumatory2(n-1);
    }
}

//Calculadora