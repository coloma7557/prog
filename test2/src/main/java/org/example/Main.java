package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double imc_javi = Test.calculate_imc(65.0, 1.82);
        System.out.println("El imc de Javi es: " + imc_javi);

        double imc_profe = Test.calculate_imc(76.7, 1.57);
        System.out.println("El imc del profe es: " + imc_profe);

        double RectangleArea = Test.calculateRectangleArea( 48.2, 56.9);
        System.out.println("El area es: " + RectangleArea);

        double PerimeterArea = Test.calculatePerimeterArea(25, 50);
        System.out.println("El perimetro es: " + PerimeterArea);

        double CircleArea = Test.calculateCircleArea(18);
        System.out.println("El area del circulo es: " + CircleArea);
    }
}
