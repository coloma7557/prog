package org.example;

import java.util.ArrayList;
import java.util.List;

public class UI {

    public static void printMainMenuOptions(){
        IO.println("=== MENÚ PRINCIPAL ===");
        IO.println("1 - Alumnos");
        IO.println("2 - Clases");
        IO.println("3 - Salir");
    }

    public static int readMainMenuOption() {
        String option = Keyboard.readString();
        return Conversions.toInteger(option);
    }

    public static void printExitMainMenu(){
        IO.println("¿Quieres salir seguro?");
        IO.println("Pulsa s para confirmar");
        IO.println("Pulsa n para cancelar salida");
    }

    public static String readExitMainMenu(){
        String option = Keyboard.readString();
        return option;
    }

    public static void printStudentMenuOptions(){
        IO.println("=== MENÚ ALUMNOS ===");
        IO.println("1 - Listar alumnos");
        IO.println("2 - Buscar alumnos");
        IO.println("3 - Añadir alumnos");
        IO.println("4 - Atrás");
    }
    public static void printAlumnosListado(List<Student> students){

        IO.println("=== LISTADO DE ALUMNOS ===");
        for(int i =0; i < students.size() ;i++ ){
            Student s = students.get(i);
            IO.println("ID: " + s.getStudentId() + " | Nombre: " + s.name + " | Edad: " + s.getAge() + " | Género: " + s.gender);
        }
        IO.println("==========================");
        IO.println("Pulsa i para volver al inicio");
        IO.println("Pulsa a para volver atrás");
    }
    public static String readAlumnosListado(){
        String option = Keyboard.readString();
        return option;
    }

    public static int readStudentMenuOptions(){
        String option = Keyboard.readString();
        return Conversions.toInteger(option);
    }

    public static Student printAddAlumnoForm() {
        IO.println("=== AÑADIR NUEVO ALUMNO ===");

        IO.println("Introduce el nombre del alumno:");
        String name = Keyboard.readString();

        IO.println("Introduce la edad del alumno:");
        int age = Conversions.toInteger(Keyboard.readString());

        IO.println("Introduce el género (MALE / FEMALE):");
        String genderStr = Keyboard.readString();
        Student.genderKind gender = Student.genderKind.valueOf(genderStr.toUpperCase());

        return new Student(0, name, age, gender);
    }

    public static void printConfirmAddAlumno(Student student) {
        IO.println("=== CONFIRMAR NUEVO ALUMNO ===");
        IO.println("Has introducido los siguientes datos:");
        IO.println("Nombre: " + student.name + " | Edad: " + student.getAge() + " | Género: " + student.gender);
        IO.println("-----------------------------------");
        IO.println("¿Qué deseas hacer?");
        IO.println("s - Guardar y añadir alumno");
        IO.println("n - Modificar datos (volver a rellenar)");
        IO.println("v - Volver al menú de alumnos (cancelar)");
    }

    public static String readConfirmAddAlumno() {
        return Keyboard.readString();
    }


    public static void printClasesMenuOptions(){
        IO.println("=== MENÚ CLASES ===");
        IO.println("1 - Listar clases");
        IO.println("2 - Buscar clases");
        IO.println("3 - Añadir clases");
        IO.println("4 - Volver atrás");
    }

    public static int readClasesMenuOptions(){
        String option = Keyboard.readString();
        return Conversions.toInteger(option);
    }

    public static void printClasesListado(List<Classroom> classrooms){

        IO.println("=== LISTADO DE CLASES ===");
        for(int i =0; i < classrooms.size() ;i++ ){
            Classroom c = classrooms.get(i);
            IO.println("ID: " + c.getClassroomId() + " | Nombre: " + c.name + " | Location: " + c.location);
        }
        IO.println("==========================");
        IO.println("Pulsa i para volver al inicio");
        IO.println("Pulsa a para volver atrás");
    }
    public static String readClasesListado() {
        String option = Keyboard.readString();
        return option;
    }

}
