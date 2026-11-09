package org.example;
import java.util.List;

public class Controller {

    public static int mainMenu() {
        UI.printMainMenuOptions();
        int option = UI.readMainMenuOption();
        return option;
    }

    public static int studentMenu() {
        UI.printStudentMenuOptions();
        int option = UI.readStudentMenuOptions();
        return option;
    }

    public static String studentListMenu() {
        List<Student> students = App.getDataManager().getStudents("");
        UI.printAlumnosListado(students);
        String option = UI.readAlumnosListado();
        return option;
    }

    public static String addStudentForm() {
        Student student = UI.printAddAlumnoForm();
        UI.printConfirmAddAlumno(student);
        String option = UI.readConfirmAddAlumno();

        if (option.equalsIgnoreCase("s")) {
            App.getDataManager().addStudent(student);
        }
        return option;
    }

    public static int classroomsMenu() {
        UI.printClasesMenuOptions();
        int option = UI.readClasesMenuOptions();
        return option;
    }
    public static String confirmExitMainMenu(){
        UI.printExitMainMenu();
        String option = UI.readExitMainMenu();
        return option;
    }


    public static String classroomListMenu() {
        List<Classroom> classrooms = App.getDataManager().getClassrooms("");
        UI.printClasesListado(classrooms);
        String option = UI.readClasesListado();
        return option;
    }




}
