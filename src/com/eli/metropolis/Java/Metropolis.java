/**
 * Created by elizabeth on 8/3/16.
 */
public class Metropolis {
    public static void main(String[] args) {
        boolean esCapital = true;
        int numeroDeCiudadanos = 200000;
        double impuestosPorCiudadano = 800.0;

        if (verificarSiEsMetropolis(esCapital, numeroDeCiudadanos, impuestosPorCiudadano)) {
            System.out.println("Si es una Metropolis");
        } else {
            System.out.println("No es una Metropolis");
        }
    }

    private static boolean verificarSiEsMetropolis(boolean esCapital, int numeroDeCiudadanos, double impuestosPorCiudadano) {
        double ingresoPromedioAnio = numeroDeCiudadanos * impuestosPorCiudadano * 12;

        if (ingresoPromedioAnio > 720000000 && numeroDeCiudadanos >= 200000 || (esCapital && numeroDeCiudadanos >= 100000)) {
            return true;
        }

        return false;
    }

}
