package org.example;

public class ArrayUtils {

    //Funcion que me pasan un array y un value y tengo que devolver el array nuevo con ese value añadido
    public static String[] add(String [] a, String value){

        if(a == null)
            return new String[0];

        String[] aux = new String[a.length +1];
        for(int i=0;i < a.length; i++){
            aux[i]=a[i];
        }
        aux[a]= aux.value;
        return aux;
    }

    //Funcion que me pasan un array y una posicion y tengo que devolver el array nuevo con esa posicon eliminada

    public static String[] remove(String[] a,)
}
