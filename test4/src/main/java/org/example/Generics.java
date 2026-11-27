package org.example;
import java.lang.reflect.Array;

public class Generics {

    //Funcion clone
    public static <T> T[] clone(T[] a) {
        if (a == null)
            return null;

        T[] aux = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length);
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        return aux;
    }
    //Funcion que me pasan un array y un value y tengo que devolver el array nuevo con ese value añadido
    public static <T> T[] add(T[] a, T value) {
        if (a == null)
            return null;
        if (value == null)
            return clone(a);

        T[] aux = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + 1);
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        aux[a.length] = value;
        return aux;
    }

    //Funcion que me pasan un array y una posicion y tengo que devolver el array nuevo con esa posicon eliminada
    public static <T> T[] remove(T[] a, int index) {
        if (a == null)
            return null;
        if (index < 0 || index >= a.length)
            return clone(a);

        T[] aux = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length - 1);
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != index) {
                aux[j++] = a[i];
            }
        }
        return aux;
    }
}
