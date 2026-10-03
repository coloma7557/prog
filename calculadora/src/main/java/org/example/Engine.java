package org.example;

public class Engine {

    static double result = 0;

    public static double performOperation(String op, double n1, double n2) {
        if (op.equals("+"))
            return n1 + n2;
        if (op.equals("-"))
            return n1 - n2;
        if (op.equals("/"))
            return n1 / n2;
        if (op.equals("*"))
            return n1 * n2;
        return Double.NaN;
    }

    public static double storeResult(double value) {
        result = value;
        return result;
    }

    public static double loadResult() {
        return result;
    }

    public static void clearResult() {
         result = 0;
    }
}
