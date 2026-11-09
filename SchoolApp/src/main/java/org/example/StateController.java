package org.example;

public class StateController {

    public enum AppState {
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

    void runApp() {
        AppState state = AppState.MAIN_MENU;

        boolean running = true;
        while (running) {

            // Main Menú
            if (state == AppState.MAIN_MENU) {
                int option = Controller.mainMenu();
                if (option == 1)
                    state = AppState.MENU_ALUMNO;
                else if (option == 2)
                    state = AppState.MENU_CLASES;
                else if (option == 3)
                    state = AppState.SALIR_CONFIRMAR;

                // MENU_ALUMNO
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

                // MENU_ALUMNO_LISTADO
            } else if (state == AppState.MENU_ALUMNO_LISTADO) {
                String option = Controller.studentListMenu();
                if (option.equals("i"))
                    state = AppState.MAIN_MENU;
                else if (option.equals("a"))
                    state = AppState.MENU_ALUMNO;


                // ADD_ALUMNO
            } else if (state == AppState.ADD_ALUMNO) {
                String option = Controller.addStudentForm();
                if (option.equals("s"))
                    state = AppState.MENU_ALUMNO;
                else if (option.equals("n"))
                    state = AppState.ADD_ALUMNO;
                else if (option.equals("v"))
                    state = AppState.MENU_ALUMNO;

                // MENU_CLASES
            } else if (state == AppState.MENU_CLASES) {
                int option = Controller.classroomsMenu();
                if (option == 1)
                    state = AppState.LISTADO_CLASES;
                else if (option == 2)
                    state = AppState.BUSCADOR_CLASES;
                else if (option == 3)
                    state = AppState.ADD_CLASE;
                else if (option == 4)
                    state = AppState.MAIN_MENU;

                // Menú ExitMainMenu
            } else if (state == AppState.SALIR_CONFIRMAR) {
                String option = Controller.confirmExitMainMenu();
                if (option.equals("s"))
                    running = false;
                else if (option.equals("n"))
                    state = AppState.MAIN_MENU;

                // LISTADO_CLASES
            } else if (state == AppState.LISTADO_CLASES) {
                String option = Controller.classroomListMenu();
                if (option.equals("i"))
                    state = AppState.MAIN_MENU;
                else if (option.equals("a"))
                    state = AppState.MENU_CLASES;
            }
        }
    }
}