package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis"};
        String[] resultado = Generics.add(nombres, "Eva");

        System.out.println(Arrays.toString(resultado));
    }
}