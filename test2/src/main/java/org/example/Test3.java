package org.example;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    //Función que me dice si un número es primo

//    public static boolean esPrimo(int num) {
//        if(num < 0)
//            return false;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0)
//                return false;
//        }
//        return true;
//
//    }
//    //Listas
//    public static void lista(int[] numeros){
//
//        List<Integer> listaNumeros = new ArrayList<>();
//
//        listaNumeros.add(1);
//        listaNumeros.add(2);
//        listaNumeros.add(3);
//    }
//
//    //Función que devuelve la media de una lista
//    public static double getAVG(List<Double> list){
//        double accumulated = 0.0;
//
//        if(list == null)
//            return 0.0;
//
//        if(list.size() == 0)
//            return 0.0;
//
//        for(int i=0; i < list.size(); i++){
//            double value = list.get(i);
//            accumulated += value;
//        }
//        return accumulated / list.size();
//    }
//    //Función que nos pasa una lista y me devuelva el valor más grande de la lista
//
//    public static double getMax(List<Double> list){
//
//        if(list == null)
//            return 0.0;
//
//        if(list.size() == 0)
//            return 0.0;
//
//        double value = list.getFirst();
//
//        for(int i=1; i < list.size() ;i++){
//            if(value < list.get(i))
//                value = list.get(i);
//        }
//        return value;
//    }
//    //Función que me pasan una lista y tengo que sumar los numeros de ella
//
//    public static double getSum(List<Double> list) {
//
//        if (list == null)
//            return 0.0;
//        if (list.size() == 0)
//            return 0.0;
//
//        double value = list.getFirst();
//
//        for (int i = 1; i < list.size(); i++) {
//            value =  value + list.get(i);
//        }
//        return value;
//    }
//
//    //Función que me devuelva la posición del numero que yo le diga
//
//    public static int getPosition(List<String> list, String value){
//        if (list == null)
//            return -1;
//        if (value == null)
//            return -1;
//
//        for(int i = 0; i < list.size(); i++){
//            String s = list.get(i);
//
//            if(value.equals(s))
//                return i;
//        }
//        return -1;
//    }
//
//    //Funcion que le paso una lista y me devuelve una lista con los elementos al contratio
//
//    public static List<Integer> invertList(List<Integer> list){
//        List<Integer> inverted = new ArrayList<Integer>();
//
//        if(list == null)
//            return null;
//
//        for(int i = list.size() -1 ; i >= 0; i--){
//            inverted.add(list.get(i));
//        }
//        return inverted;
//
//    }
//
//
//    //Función que le paso lista de enteros y dewvuelve otra lista con lo que hay pero sólo las posiciones pares
//
//    public static List<Integer> ParList(List<Integer> l){
//        if(l == null){
//            return new ArrayList<>();
//        }
//
//        List<Integer> result = new ArrayList<>();
//
//        for(int i=0; i < l.size() ;i++){
//            int numero = l.get(i);
//
//            if(numero % 2 == 0 ) {
//                result.add(l.get(i));
//            }
//        }
//
//        return result;
//    }
//
//    //Función que le paso una lista y me la devuelve ordenada de menor a mayor
//    public static void getOrder(List<Double> list){
//
//        if (list == null || list.size() == 0) {
//            IO.print("La lista contiene un null o está vacía");
//            return;
//        }
//
//        for(int i = 0; i < list.size() -1; i++){
//            double num1 = list.get(i);
//            double num2 = list.get(i + 1);
//
//                if (num1 > num2) {
//                    double temp = num1;
//                    num1 = num2;
//                    num2 = temp;
//                    list.set(i, num2);
//                    list.set(i + 1, num1);
//            }
//        }
//    }

    //RightShift y LeftShift - Lista desplazada hacia la derecha o izquierda //Swap
    public static void rightShift1(List<String> l){

        var last = l.get(l.size()-1);
        for(int i = 0;i < l.size();i++){
            var aux1 = l.get(i);
            var aux2 = l.set(i, last);
            last = aux1;
        }
    }

    public static void rightShift2(List<String> l){
        var last = l.get(l.size()-1);

        for(int i = l.size()-1; i > 0 ;i--){
            var element = l.get(i-1);
            l.set(i, element);
        }
        l.set(0, last);
    }

    public static void rightShift3(List<String> l) {
        for (int i = l.size() - 1; i > 0; i--) {
            var temp = l.get(i);
            l.set(i, l.get(i - 1));
            l.set(i - 1, temp);
        }
    }

    public static void leftShift1(List<String> l) {
        var first = l.get(0);
        for (int i = l.size() - 1; i >= 0; i--) {
            var aux1 = l.get(i);
            l.set(i, first);
            first = aux1;
        }
    }

    public static void leftShift2(List<String> l) {
        var first = l.get(0);
        for (int i = 0; i < l.size() - 1; i++) {
            var element = l.get(i + 1);
            l.set(i, element);
        }
        l.set(l.size() - 1, first);
    }

    public static void leftShift3(List<String> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            var temp = l.get(i);
            l.set(i, l.get(i + 1));
            l.set(i + 1, temp);
        }
    }

    //Mover la lista una cantidad de veces concreta hacia la derecha

    public static void rightShiftCount(List<String> l, int count){
        for(int i = 0; i < count; i++){
            rightShift2(l);
        }
    }
    //Mover la lista una cantidad de veces concreta hacia la izquierda
    public static void leftShiftCount(List<String> l, int count){
        for(int i = 0; i < count; i++){
            leftShift1(l);
        }
    }

    //Funcion que borre todos los usuarios de mayores de cierta edad en una lista

    public static void deleteStudentByAge(List<String> l, int age){
        if(l == null)
            return;
        if(age == 0)
            return;

        for (int i = l.size() - 1; i >= 0; i--) {
            int studentAge = Integer.parseInt(l.get(i));

            if (studentAge > age) {
                l.remove(i);
            }
        }
    }

    //Función que recibe una lista de usuarios y quiero la posición en la que se encuentra el usuario más viejo

    public static int oldUserPosition(List<PruebasTest3> user){
        if (user == null)
            return -1;

        int position = -0;
        int age = -0;

        for (int i = 0; i < user.size(); i++){
            int userAge = user.get(i).getEdad();

            if(userAge > age){
                age = userAge;
                position = i;
            }
        }
        return position;
    }



    //Función que le paso una lista de hechizos y me devuelva si hay un hechizo duplicado

    public static boolean hechizosList(HechizoClass hechizoBuscado, List<HechizoClass> hechizo, int position){


        for(int i = position; i < hechizo.size(); i++){
            HechizoClass hechizodeLaLista = hechizo.get(i);

            if(hechizoBuscado.getNombre().equals(hechizodeLaLista.getNombre()) && hechizoBuscado.getCosteMana() == (hechizodeLaLista.getCosteMana()) && hechizodeLaLista.getPoder() == (hechizoBuscado.getPoder()))
                return true;
        }
        return false;
    }

    public static boolean hayHechizosRepetidos(List<HechizoClass> list){
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (hechizosList(list.get(i), list, i + 1)) {
                return true;
            }
        }
        return false;
    }
}

//stack y heap
//Stack Lista = 8 bytes Enteros = 4 bytes
// l = new (le dice al SO que me reserve espacio para la lista)