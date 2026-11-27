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
    public static int[] cloneInt(int[] a) {
        if (a == null)
            return new int[0];
        int[] aux = new int[a.length];
        for (int i = 0; i < a.length; i++) {
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
    //Funcion que me pasan un array de Strings y un texto, y tengo que devolver la posicion (int)
    // de la primera vez que aparece ese value, o -1 si no esta

    public static int returnPosition(String[] a, String target) {
        if (a == null || target == null)
            return -1;

        for (int i = 0; i < a.length; i++) {
            String aux = a[i];
            if (aux.equals(target))
                return i;
        }
        return -1;
    }
    //Funcion que me pasan un array de Strings y un texto (target), y tengo que devolver
    //true si ese texto esta en el array o false si no esta

    public static boolean exists(String[] a, String target) {
        if (returnPosition(a, target) == -1)
            return false;
        return true;
    }

    //Funcion que me pasan un array de Strings y un texto (target), y tengo que devolver cuantas veces
    // aparece ese texto en el array (int)

    public static int repeat(String[] a, String target) {
        if (a == null || target == null)
            return 0;

        int contador = 0;
        for(int i = 0; i < a.length;i++){
            if(a[i].equals(target))
                contador++;
        }
        return contador;
    }
    //Funcion que me pasan un array de ints y tengo que devolver el numero mas grande del array (int)

//    public static int max(int[] a){
//        if(a == null || a.length == 0)
//            return 0;
//
//
//    }

}

//



