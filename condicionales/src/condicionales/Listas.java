package condicionales;
/**
 *
 * @author Juan José Chacón Cruz u20251233255
 */
public class Listas {
    public static void main(String[] args) {
        int[] vector = generaArrayInt(10, 10, 20);
        muestraArrayInt(vector);
        int valorMin = minimoArrayInt(vector);
        System.out.println("El valor mínimo es: " + valorMin);
    }
    public static int[] generaArrayInt(int n, int min, int max) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*(max - min) + min);
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
            if (vector[j] < min){
                min = vector[j];
            }
        }
        return min;
    }
}
