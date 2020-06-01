public class Ejercicio1 {

    Float totalDePelotas;
    Float pelotasBlancas;
    Float pelotasRojas;

    public Ejercicio1(Float totalDePelotas, Float pelotasBlancas, Float pelotasRojas) {
        this.totalDePelotas = totalDePelotas;
        this.pelotasBlancas = pelotasBlancas;
        this.pelotasRojas = pelotasRojas;
    }

    public Float calcularProbDeSacarBolaBlanca() {
        try {
            if (this.totalDePelotas == (this.pelotasBlancas + this.pelotasRojas)) {
                Float probabilidad = 100 * pelotasBlancas / totalDePelotas;
                System.out.println("La probabilidad de sacar una pelota blanca es de " + probabilidad + "%");
                return probabilidad;
            } else {
                System.out.println("Los campos introducidos no son correctos.");
                return 0f;
            }
        } catch (ArithmeticException error) {
            System.out.println("Ha habido un error, el valor de totalDePelotas es 0");
            return 0f;
        }
    }

    public Float calcularProbDeSacarBolaRoja() {
        try {
            if (this.totalDePelotas == (this.pelotasBlancas + this.pelotasRojas)) {
                Float probabilidad = 100 * pelotasRojas / totalDePelotas;
                System.out.println("La probabilidad de sacar una pelota roja es de " + probabilidad + "%");
                return probabilidad;
            } else {
                System.out.println("Los campos introducidos no son correctos.");
                return 0f;
            }
        } catch (ArithmeticException error) {
            System.out.println("Ha habido un error, el valor de totalDePelotas es 0");
            return 0f;
        }
    }

    public void calcularProbDeDosRojasSeguidas() {
        try {
            Float probabilidad;
            Float rojaEnLaPrimera = calcularProbDeSacarBolaRoja();
            Float nuevoNumeroDeRojas = this.pelotasRojas - 1f;
            Float nuevoTotalDePelotas = this.totalDePelotas - 1f;

            Float rojaEnLaSegunda = nuevoNumeroDeRojas / nuevoTotalDePelotas;
            probabilidad = rojaEnLaPrimera * rojaEnLaSegunda;
            System.out.println("La probabilidad de sacar dos rojas seguidas es de " + probabilidad + "%");
        } catch (ArithmeticException error) {
            System.out.println("Ha habido un error, el valor de totalDePelotas es 0");
        }
    }
}
