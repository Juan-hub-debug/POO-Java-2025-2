package condicionales;

import java.util.Scanner;

/**
 * Un proveedor de reproductores de música ofrece un descuento del 10% sobre el
 * precio sin IVA, de algún aparato, si esta cuesta U$500 o más. Además,
 * independientemente de esto, ofrece un 5% de descuento si la marca es “NOSY”.
 * Determinar cuánto pagara, con IVA incluido, un cliente cualquiera por la
 * compra de su aparato. El IVA es del 19%.
 *
 * @author Juan Jose Chacon Cruz u20251233255
 */
public class Condicionales3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = {350, 500, 550, 700};
        double iva = 0.19;
        System.out.println("¡Bienvenido a mi tienda! \nTengo disponible (Con IVA):");
        System.out.println("Obtienes un 10% de descuento sobre el precio sin IVA en productos mayores a $500, y un 5% más en la marca NOSY");
        System.out.println("1. Mp3 1.0 - Generica $350\n2. Mp3 2.0 - Generica $480\n3. Mp3 1.0 - NOSY $550\n4. Mp3 2.0 - NOSY $700");
        System.out.print("Elige con un número (1-4) el producto que quieras adquirir: ");
        
        int eleccion = input.nextInt();
        int i = eleccion - 1;
        
        double noIva = valores[i] - (valores[i] * iva);
        double descuento;
        double siIva;

        switch (eleccion) {
            case 1:
                System.out.println("Haz elegido 'Mp3 1.0 - Generica' por un valor de $" + valores[i] + "\n¡¡Feliz compra!!");
                break;
            case 2:
                descuento = noIva - (noIva * 0.1);
                siIva = descuento + (descuento * iva);
                System.out.println("Haz elegido 'Mp3 2.0 - Generica' por un valor de $" + valores[i]);
                System.out.println("Tienes un descuento sobre el valor sin IVA.\nValor sin IVA: $" + noIva);
                System.out.println("Valor sin IVA con descuento: $" + descuento);
                System.out.println("Valor con IVA y descuento:$" + siIva);
                System.out.println("¡Feliz compra!");
                break;
            case 3:
                descuento = noIva - (noIva * 0.1);
                siIva = descuento + (descuento * iva);
                System.out.println("Haz elegido 'Mp3 1.0 - NOSY' por un valor de $" + valores[i]);
                System.out.println("Tienes un descuento sobre el valor sin IVA.\nValor sin IVA: $" + noIva);
                System.out.println("Valor sin IVA con descuento: $" + descuento);
                System.out.println("Valor con IVA y descuento:$" + siIva);
                System.out.println("Valor a pagar con descuento por ser marca NOSY: $" + (siIva - (siIva * 0.05)));
                System.out.println("¡Feliz compra!");
                break;
            case 4:
                descuento = noIva - (noIva * 0.1);
                siIva = descuento + (descuento * iva);
                System.out.println("Haz elegido 'Mp3 2.0 - NOSY' por un valor de $" + valores[i]);
                System.out.println("Tienes un descuento sobre el valor sin IVA.\nValor sin IVA: $" + noIva);
                System.out.println("Valor sin IVA con descuento: $" + descuento);
                System.out.println("Valor con IVA y descuento:$" + siIva);
                System.out.println("Valor a pagar con descuento por ser marca NOSY: $" + (siIva - (siIva * 0.05)));
                System.out.println("¡Feliz compra!");
                break;
            default:
                System.out.println("El número ingresado no se encuentra en la lista.");
                break;
        }
    }
}
