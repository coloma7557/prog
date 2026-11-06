package org.example;

import java.util.ArrayList;
import java.util.List;

public class UI {

    public static void printMainMenuOptions(){
        IO.println("1 - Alumnos");
        IO.println("2 - Clases");
        IO.println("3 - Salir");
    }

    public static int readMainMenuOption() {
        String option = Keyboard.readString();
        return Conversions.toInteger(option);
    }

    public static String menuAlumno(){
        IO.println("1 - Listar Alumnos");
        IO.println("2 - Buscar Alumnos");
        IO.println("3 - Añadir Alumnos");
        IO.println("4 - Atrás");
        return Keyboard.readString();

    }

}
