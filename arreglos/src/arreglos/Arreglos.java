package arreglos;

/**
 *
 * @author Juan José Chacón Cruz u20251233255
 */
public class Arreglos {

public static void main(String[] args) {
        int[] vector = generaArrayInt(5, 1, 6);
        muestraArrayInt(vector);
        int valorMin = minimoArrayInt(vector);
        int valorMax = maximoArrayInt(vector);
        double valorMedia = mediaArrayInt(vector);
        System.out.println("El valor mínimo es: " + valorMin);
        System.out.println("El valor máximo es: " + valorMax);
        System.out.println("La media total de todos los números es de: " + valorMedia);

        if (estaEnArrayInt(vector, 2)) {
        } else {
        }
        posicionEnArrayInt(vector, 4);
    }

    public static int[] generaArrayInt(int n, int min, int max) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min) + min);
        }
        return vector;
    }

    public static int[] muestraArrayInt(int[] vector) {
        for (int k = 0; k < vector.length; k++) {
            System.out.println(vector[k]);
        }
        return vector;
    }

    public static int minimoArrayInt(int[] vector) {
        int min = vector[0];
        for (int j = 1; j < vector.length; j++) {
            if (vector[j] < min) {
                min = vector[j];
            }
        }
        return min;
    }

    public static int maximoArrayInt(int[] vector) {
        int max = vector[0];
        for (int z = 1; z < vector.length; z++) {
            if (vector[z] > max) {
                max = vector[z];
            }
        }
        return max;
    }

    public static double mediaArrayInt(int[] vector) {
        int suma = 0;

        for (int x = 0; x < vector.length; x++) {
            suma = suma + vector[x];
        }
        double media = suma / vector.length;
        return media;
    }

    public static boolean estaEnArrayInt(int[] vector, int existeNumero) {
        for (int g = 0; g < vector.length; g++) {
            if (existeNumero == vector[g]) {
                System.out.println("El número: " + existeNumero + " SI está en el arreglo");
                return true;
            }
        }
        System.out.println("El número: " + existeNumero + " NO está en el arreglo");
        return false;
    }
    
    public static int posicionEnArrayInt(int[] vector, int valor) { 
        for (int f = 0; f < vector.length; f++){
            if (vector[f] == valor) {
                System.out.println("El número " + valor + " está en el índice: " + f);
                return f;
            }
        }
        System.out.println("El número " + valor + " NO está en el arreglo");
        return -1;
    }
}
