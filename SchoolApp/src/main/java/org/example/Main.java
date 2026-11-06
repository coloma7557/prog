package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Probamos a llamar directamente a la UI para ver el menú por consola
        int opcion = UI.readMainMenuOption();
        System.out.println("Has pulsado la opción: " + opcion);
    }
}