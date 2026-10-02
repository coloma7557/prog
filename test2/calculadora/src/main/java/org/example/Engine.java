package org.example;

public class Engine {

    double result = 0;
    public static double performOperation(String op, double n1, double n2){
        if(op.equals("+"))
            return n1 + n2;
        if(op.equals("-"))
            return n1 - n2;
        if(op.equals("/"))
            return n1 / n2;
        if(op.equals("*"))
            return n1 * n2;
        //if(op.equals("s")
        return Double.NaN;
    }

    public static double storeResult(double value){

    }

    public static double loadResult(){

    }

    public static void clearResult(){

    }
}
