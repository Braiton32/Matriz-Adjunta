public class TestingMatrizAdjunta {
    public static void main(String[] args) {
        String archivoEntrada = "matriz.txt";
        String archivoSalida = "matrizAdjunta.txt";

        double[][] matriz = MatrizAdjunta.leerMatriz(archivoEntrada);

        if (matriz != null) {
            System.out.println("matriz Original:");
            MatrizAdjunta.imprimirMatriz(matriz);

            double[][] adjunta = MatrizAdjunta.matrizAdjunta(matriz);

            if (adjunta != null) {
                System.out.println("\n Matriz Adjunta:");
                MatrizAdjunta.imprimirMatriz(adjunta);

                MatrizAdjunta.escribirArchivo(adjunta, archivoSalida);
                System.out.println("\n archivo generado: " + archivoSalida);
            } else {
                System.out.println("\n la matriz no es cuadrada. No se puede calcular la adjunta.");
            }
        } else {
            System.out.println("error al leer el archivo.");
        }
    }
}
