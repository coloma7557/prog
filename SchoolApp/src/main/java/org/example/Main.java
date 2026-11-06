package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int void main(String[] args) {
        // Probamos a llamar directamente a la UI para ver el menú por consola
        int opcion = UI.printMainMenuOptions();
        System.out.println("Has pulsado la opción: " + opcion);
    }
}