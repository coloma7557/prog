package org.example;

public class Controller {

    public static int mainMenu() {
        UI.printMainMenuOptions();
        int option = UI.readMainMenuOption();
        return option;             // Devuelve el número entero
    }

    public static int studentMenu() {
        UI.printMainMenuOptions();
        int option = UI.readStudentOptions();
        return option;
    }

    public static int classroomsMenu() {
        return 0;
    }
    public static confirmExit(){
        return 0;
    }
}
