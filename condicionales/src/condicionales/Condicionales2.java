package condicionales;

import java.util.Scanner;

/**
 * En una serviteca se ha establecido una promoción de las llantas marca
 * “Pinchadas”, que consiste en lo siguiente: 
 * 
 * • Si se compran menos de cinco
 * llantas el precio es de U$100 cada una, de U$75 si se compran de cinco a 10 y
 * de U$50 si se compran más de 10.
 * 
 * • Obtener la cantidad de dinero que una
 * persona tiene que pagar por cada una de las llantas que compra y la que tiene
 * que pagar por el total de la compra.
 * 
 * @author Juan Jose Chacon Cruz u20251233255
 */
public class Condicionales2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¡¡Bienvenido a Pinchadas S.A.S!! \n ¿Cuántas llantas deseas comprar?: ");

        int numeroDeLlantas = input.nextInt();
        int valorLlanta;
        int valorTotal;

        if (numeroDeLlantas < 5) {
            valorLlanta = 100;
            valorTotal = valorLlanta * numeroDeLlantas;
            System.out.println("El valor unitario de cada llanta es de $100. Tu total a pagar es de: $" + valorTotal);
        } else if (numeroDeLlantas >= 5 && numeroDeLlantas <= 10) {
            valorLlanta = 75;
            valorTotal = valorLlanta * numeroDeLlantas;
            System.out.println("El valor unitario de cada llanta es de $75. Tu total a pagar es de: $" + valorTotal);
        } else {
            valorLlanta = 50;
            valorTotal = valorLlanta * numeroDeLlantas;
            System.out.println("El valor unitario de cada llanta es de $50. Tu total a pagar es de: $" + valorTotal);
        }
    }
}
