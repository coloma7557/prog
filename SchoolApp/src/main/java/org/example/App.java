package org.example;

public class App {

    private static DataManager dm = new DataManager();

    private App() {
        // Constructor privado para evitar instanciación
    }

    public static DataManager getDataManager() {
        return dm;
    }
}
