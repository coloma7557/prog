package org.example;

public class Test3 {
    //Función que me dice si un número es primo

    public static boolean esPrimo(int num) {
        if(num < 0)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }
}
