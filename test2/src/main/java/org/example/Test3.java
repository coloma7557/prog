package org.example;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    //Función que me dice si un número es primo

    public static boolean esPrimo(int num) {
        if(num < 0)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }
    //Listas
    public static void lista(int[] numeros){

        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
    }

    //Función que devuelve la media de una lista
    public static double getAVG(List<Double> list){
        double accumulated = 0.0;

        if(list == null)
            return 0.0;

        if(list.size() == 0)
            return 0.0;

        for(int i=0; i < list.size(); i++){
            double value = list.get(i);
            accumulated += value;
        }
        return accumulated / list.size();
    }
    //Función que nos pasa una lista y me devuelva el valor más grande de la lista

    public static double getMax(List<Double> list){

        if(list == null)
            return 0.0;

        if(list.size() == 0)
            return 0.0;

        double value = list.getFirst();

        for(int i=1; i < list.size() ;i++){
            if(value < list.get(i))
                value = list.get(i);
        }
        return value;
    }
    //Función que me pasan una lista y tengo que sumar los numeros de ella

    public static double getSum(List<Double> list) {

        if (list == null)
            return 0.0;
        if (list.size() == 0)
            return 0.0;

        double value = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            value =  value + list.get(i);
        }
        return value;
    }

    //Función que me devuelva la posición del numero que yo le diga

    public static int getPosition(List<String> list, String value){
        if (list == null)
            return -1;
        if (value == null)
            return -1;

        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);

            if(value.equals(s))
                return i;
        }
        return -1;
    }

    //Funcion que le paso una lista y me devuelve una lista con los elementos al contratio

    public static List<Integer> invertList(List<Integer> list){
        List<Integer> inverted = new ArrayList<Integer>();

        if(list == null)
            return null;

        for(int i = list.size() -1 ; i >= 0; i--){
            inverted.add(list.get(i));
        }
        return inverted;

    }


    //Función que le paso lista de enteros y dewvuelve otra lista con lo que hay pero sólo las posiciones pares

    public static List<Integer> ParList(List<Integer> l){
        if(l == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0; i < l.size() ;i++){
            int numero = l.get(i);

            if(numero % 2 == 0 ) {
                result.add(l.get(i));
            }
        }

        return result;
    }

    //Función que le paso una lista y me la devuelve ordenada de menor a mayor
    public static void getOrder(List<Double> list){

        if (list == null || list.size() == 0) {
            IO.print("La lista contiene un null o está vacía");
            return;
        }

        for(int i = 0; i < list.size() -1; i++){
            double num1 = list.get(i);
            double num2 = list.get(i + 1);

                if (num1 > num2) {
                    double temp = num1;
                    num1 = num2;
                    num2 = temp;
                    list.set(i, num2);
                    list.set(i + 1, num1);
            }
        }
    }
}

//stack y heap
//Stack Lista = 8 bytes Enteros = 4 bytes
// l = new (le dice al SO que me reserve espacio para la lista)