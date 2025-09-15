package condicionales;

/**
 * @author Juan José Chacón Cruz u20251233255
 */
public class monitorClimatico {
    
    //Método de Análisis
    
    public static void main(String[] args) {
        
        int[] temperaturas = generarTemperaturas(0, 30);
        mostrarTemperaturas(temperaturas);
        int valorMin = temperaturaMinima(temperaturas);
        int valorMax = temperaturaMaxima(temperaturas);
        double media = mediaTemperaturas(temperaturas);
        double desviacionEstandar = desviacionEstandar(temperaturas);
        System.out.println("La temperatura mas baja registrada es: " + valorMin + "°C");
        System.out.println("La temperatura mas alta registrada es: " + valorMax + "°C");
        System.out.println("El promedio de las temperaturas registradas de la semana es de: " + media + "°C");
        System.out.println("La desviacion estandar de las temperaturas es: " + desviacionEstandar);
        
        if (hayTemperatura(temperaturas, 4)) {
        } else {
        }
        
        diaDeTemperatura(temperaturas, 3);
        invertirTemperaturas(temperaturas);
        rotarTemperaturasDerecha(temperaturas, 2);
        rotarTemperaturasIzquierda(temperaturas, 2);
        String[] climas = clasificarTemperaturas(temperaturas);
        mostrarClasificacionTemps(climas);
        System.out.println("Hay una desviación los siguientes días:");
        detectarAnomalias(temperaturas);
    }

    public static int[] generarTemperaturas(int min, int max) {
        int[] temperaturas = new int[7];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (int) (Math.random() * (max - min) + min);
        }
        return temperaturas;
    }
    
    public static int[] mostrarTemperaturas(int[] temperaturas){
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int x = 0; x < temperaturas.length; x++){
        System.out.print("|" + dias[x] + ": " + temperaturas[x] + "°C| ");
        }
        System.out.println("");
        return temperaturas;
    }
    
    public static int temperaturaMinima(int[] temperaturas) {
        int min = temperaturas[0];
        for (int j = 1; j < temperaturas.length; j++) {
            if (temperaturas[j] < min) {
                min = temperaturas[j];
            }
        }
        return min;
    }
    
    public static int temperaturaMaxima(int[] temperaturas) {
        int max = temperaturas[0];
        for (int z = 1; z < temperaturas.length; z++) {
            if (temperaturas[z] > max) {
                max = temperaturas[z];
            }
        }
        return max;
    }
    
    public static double mediaTemperaturas(int[] temperaturas) {
        int suma = 0;
        for (int g = 0; g < temperaturas.length; g++) {
            suma += temperaturas[g];
        }
        double promedio = (double) (suma) / temperaturas.length;
        return promedio;
    }

    public static double desviacionEstandar(int[] temperaturas) {
        int suma = 0;
        for (int a = 0; a < temperaturas.length; a++) {
            suma += temperaturas[a];
        }
        double media = (double) (suma) / temperaturas.length;
        
        int sumaDesvSimple = 0;
        for (int f = 0; f < temperaturas.length; f++) {
            double desvSimple = Math.pow(temperaturas[f] - media, 2);
            sumaDesvSimple += desvSimple;
        }
        double varianza = (double) (sumaDesvSimple) / (temperaturas.length - 1);
        double desvEstandar = Math.sqrt(varianza);
        return desvEstandar;
    }

    public static boolean hayTemperatura(int[] temperaturas, int valor) {
        for (int t = 0; t < temperaturas.length; t++) {
            if (valor == temperaturas[t]) {
                System.out.println("La temperatura " + valor + "°C SI se encuentra en el registro de la semana");
                return true;
            }
        }
        System.out.println("La temperatura " + valor + "°C NO se encuentra en el registro de la semana");
        return false;
    }
    
    public static int diaDeTemperatura(int[] temperaturas, int valor) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("El día " + dias[valor] + " se registraron: " + temperaturas[valor] + "°C");
        return 0;
    }
    
    //Métodos de transformación
    
    public static int invertirTemperaturas(int[] temperaturas){
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int r = temperaturas.length -1; r >= 0; r --){
            System.out.print("|"+ dias[r] + ": " + temperaturas[r] + "°C| ");
        }
        System.out.println("");
        return 0;
    }
    
    public static int rotarTemperaturasDerecha(int[] temperaturas, int n) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        for (int m = n; m < temperaturas.length; m++){
            System.out.print("|" + dias[m] + ": " + temperaturas[m] + "°C| ");
        }
        
        for (int m = 0; m != n; m++) {
            System.out.print("|" + dias[m] + ": " + temperaturas[m] + "°C| ");
        }
        System.out.println("");
        return 0;
    }
    
    public static int rotarTemperaturasIzquierda(int[] temperaturas, int n) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int iniciador = temperaturas.length - n;
        for (int p = iniciador; p < temperaturas.length; p++) {
            System.out.print("|" + dias[p] + ": " + temperaturas[p] + "°C| ");
        }

        for (int p = 0; p != iniciador; p++) {
            System.out.print("|" + dias[p] + ": " + temperaturas[p] + "°C| ");
        }
        System.out.println("");
        return 0;
    }
    
    public static String[] clasificarTemperaturas(int[] temperaturas) {
        String[] temps = new String[temperaturas.length];
        
        for (int e = 0; e < temperaturas.length; e++) {
            if (temperaturas[e] < 18) {
                temps[e] = "Frio";
            } else if (temperaturas[e] >= 18 && temperaturas[e] <= 25) {
                temps[e] = "Templado";
                } else {
                temps[e] = "Caliente";
            }
        }
        return temps;
    }
    
    public static String mostrarClasificacionTemps(String[] clasesDeTemperaturas) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int u = 0; u < clasesDeTemperaturas.length; u++) {
            System.out.print("|" + dias[u] + ": " + clasesDeTemperaturas[u] + "| ");
        }
        System.out.println("");
        return null;
    }
    
    public static String detectarAnomalias(int[] temperaturas) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        int suma = 0;
        for (int r = 0; r < temperaturas.length; r++) {
            suma += temperaturas[r];
        }
        double media = (double) (suma) / temperaturas.length;
        int sumaDesvSimple = 0;
        
        for (int f = 0; f < temperaturas.length; f++) {
            double desvSimple = Math.pow(temperaturas[f] - media, 2);
            sumaDesvSimple += desvSimple;
        }
        double varianza = (double) (sumaDesvSimple) / (temperaturas.length - 1);
        double desvEstandar = Math.sqrt(varianza);
        for (int f = 0; f < temperaturas.length; f++) {
            double desvSimple = Math.pow(temperaturas[f] - media, 2);
            if (desvSimple >= desvEstandar * 1.5) {
                System.out.println(dias[f]);
            }
        }
        return null;
    }
}