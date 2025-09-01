package condicionales;

import java.util.Scanner;

/**
 * En una tienda de computadoras se planea ofrecer a los clientes un descuento
 * que dependerá del número de equipos que compre. Si las computadoras son menos
 * de cinco se les dará un 10% de descuento sobre el total de la compra; si el
 * número de computadoras es mayor o igual a cinco pero menos de diez se le
 * otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento.
 * El precio de cada computadora es de U$500.
 *
 * @author Juan Jose Chacon Cruz u20251233255
 */
public class Condicionales {

    public static void main(String[] args) {
        int valorPc = 500;
        double valorConDesc;
        double valorSinDesc;
        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuántos computadores compraste?: ");
        int cantidadDePcs = input.nextInt();

        if (cantidadDePcs < 5) {
            valorSinDesc = valorPc * cantidadDePcs;
            valorConDesc = valorSinDesc - (valorSinDesc * 0.1);
            
            System.out.println("Obtuviste un 10% de descuento. Valor Total a pagar: " + valorConDesc);
            
        } else if (cantidadDePcs >= 5 && cantidadDePcs < 10) {
            valorSinDesc = valorPc * cantidadDePcs;
            valorConDesc = valorSinDesc - (valorSinDesc * 0.2);

            System.out.println("Obtuviste un 10% de descuento. Valor Total a pagar: " + valorConDesc);
            
        } else {
            valorSinDesc = valorPc * cantidadDePcs;
            valorConDesc = valorSinDesc - (valorSinDesc * 0.4);

            System.out.println("Obtuviste un 10% de descuento. Valor Total a pagar: " + valorConDesc);
        }
    }
}