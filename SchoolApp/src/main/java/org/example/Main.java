package org.example;

public class Main {
    public static void main(String[] args) {

        App.getDataManager().addStudent(new Student(0, "Juan", 20, Student.genderKind.MALE));
        App.getDataManager().addStudent(new Student(0, "Maria", 22, Student.genderKind.FEMALE));

        App.getDataManager().addClassroom(new Classroom(0, "Aula 101", "Edificio Principal"));
        App.getDataManager().addClassroom(new Classroom(0, "Aula 102", "Edificio Principal"));

        // 2. Creamos el controlador de estados y arrancamos la aplicación
        StateController appController = new StateController();
        appController.runApp();
    }
}