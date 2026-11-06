package org.example;

public class StateController {

    public enum AppState{
        MAIN_MENU, MENU_ALUMNO, MENU_CLASES, SALIR_CONFIRMAR,
    }

    void runApp(){
        AppState state = AppState.MAIN_MENU;

        boolean running = true;
        while (running){
            if(state == AppState.MAIN_MENU) {
                int option = Controller.mainMenu();
                if (option == 1)
                    state = AppState.MENU_ALUMNO;
                else if (option == 2)
                    state = AppState.MENU_CLASES;
            } else if (state == AppState.MENU_ALUMNO) {
                int option = Controller.studentMenu();
                if (option == 1)
                    state = AppState.MENU_CLASES;
                else if (option == 1)
                    state = AppState.MENU_CLASES;

            }
        }



    }

}
