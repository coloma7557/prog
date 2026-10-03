package org.example;


public class Conversions {

    public static boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isReal(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int toInteger(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return 0;
        }
    }

    public static double toReal(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            return Double.NaN;
        }
    }

    public static String toString(int value) {
        return Integer.toString(value);
    }

    public static String toString(double value) {
        return Double.toString(value);
    }
}
