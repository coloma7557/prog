package org.example;

public class HechizoClass {
    private String nombre;
    private int poder;
    private int costeMana;

    // Constructor
    public HechizoClass(String nombre, int poder, int costeMana) {
        this.nombre = nombre;
        this.poder = poder;
        this.costeMana = costeMana;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getPoder() {
        return this.poder;
    }

    public int getCosteMana() {
        return this.costeMana;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setCosteMana(int costeMana) {
        this.costeMana = costeMana;
    }
}

