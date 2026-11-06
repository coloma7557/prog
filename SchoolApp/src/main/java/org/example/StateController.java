package org.example;

public class StateController {

    public enum AppState{
        MAIN_MENU,
        MENU_ALUMNO,
        MENU_CLASES,
        SALIR_CONFIRMAR,
        MENU_ALUMNO_LISTADO,
        BUSCADOR_ALUMNO,
        ADD_ALUMNO,
        LISTADO_CLASES,
        BUSCADOR_CLASES,
        ADD_CLASE

    }

    void runApp(){
        AppState state = AppState.MAIN_MENU;

        boolean running = true;
        while (running){

            //Main Menú
            if(state == AppState.MAIN_MENU) {
                int option = Controller.mainMenu();
                if (option == 1)
                    state = AppState.MENU_ALUMNO;
                else if (option == 2)
                    state = AppState.MENU_CLASES;
                else if (option == 3)
                    state = AppState.SALIR_CONFIRMAR;

                //MENU_ALUMNO
            } else if (state == AppState.MENU_ALUMNO) {
                int option = Controller.studentMenu();
                if (option == 1)
                    state = AppState.MENU_ALUMNO_LISTADO;
                else if (option == 2)
                    state = AppState.BUSCADOR_ALUMNO;
                else if (option == 3)
                    state = AppState.ADD_ALUMNO;
                else if (option == 4)
                    state = AppState.MAIN_MENU;

                //MENU_CLASES
            } else if (state == AppState.MENU_CLASES){
                int option = Controller.classroomsMenu();
                if (option == 1)
                    state = AppState.LISTADO_CLASES;
                if (option == 2)
                    state = AppState.BUSCADOR_CLASES;
                if (option == 3)
                    state = AppState.ADD_CLASE;
                if (option == 4)
                    state = AppState.MAIN_MENU;
            } else if (state == AppState.SALIR_CONFIRMAR){
                String option = Controller.exitMenu();
                if (option.equals(s))
                    running = false;
                if (option.equals(n))
                    state = AppState.MAIN_MENU;

            }
            }
        }

    }
