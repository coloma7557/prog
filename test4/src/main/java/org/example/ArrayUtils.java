package org.example;

public class ArrayUtils {

    //Arrays
//Int[] a = new int[10] Creo un array con 10 elementos y no se puede modificar.
//Asignar valor al array a[0]=3
//Saber el contenido del array a[1]= a[0]
//Saber tamaño array int l = a.lenght;

    //Función clone para Strings
    public static String[] cloneString(String[] a) {
        if (a == null)
            return new String[0];
        String[] aux = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        return aux;
    }

   //Función clone para Int
    public static int[] cloneInt(int[] a){
        if(a == null)
            return new int[0];
        int[] aux = new int[a.length];
        for(int i = 0; i <a.length;i++){
            aux[i] = a[i];
        }
        return aux;
    }

    //Funcion que me pasan un array y un value y tengo que devolver el array nuevo con ese value añadido
    public static String[] add(String[] a, String value) {

        if (a == null)
            return new String[0];
        if (value == null)
            return cloneString(a);
        //a.clone();

        String[] aux = new String[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        aux[a.length] = value;
        return aux;
    }

    //Funcion que me pasan un array y una posicion y tengo que devolver el array nuevo con esa posicon eliminada

    public static String[] remove(String[] a, int index) {
        if (a == null)
            return new String[0];
        if (index < 0 || index >= a.length)
            return cloneString(a);

        String[] aux = new String[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != index) {
                aux[j++] = a[i];
            }
        }
        return aux;
    }
}
