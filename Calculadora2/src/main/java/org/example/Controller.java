package org.example;

public class Controller {

    public static void runApp() {

        UI.printHeader();
        while (true){

            String op = UI.printOperationRequest();

            if (op.equals("s")) {
                UI.printBye();
            }
            else {
                double n1 = UI.printFirstNumberRequest();
                double n2 = UI.printSecondNumberRequest();
                double result = Engine.performOperation(op, n1, n2);

                UI.printResult(n1, n2, op, result);
            }
        }
    }
}