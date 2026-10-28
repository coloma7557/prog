package org.example;
import java.util.Scanner;


public class Keyboard {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readString() {
        return scanner.nextLine();
    }
}
