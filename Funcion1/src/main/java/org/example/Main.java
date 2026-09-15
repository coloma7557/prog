package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double imc_javi = test.calculate_imc(65.0, 1.82);
        System.out.println("El imc de Javi es: " + imc_javi);

        double imc_profe = test.calculate_imc(76.7, 1.57);
        System.out.println("El imc del profe es: " + imc_profe);
    }
}
