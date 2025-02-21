public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 10, 8},
                {16, 11, 12}
        };

        int[][] matrizTranspuesta = TransponerMatriz(matriz);

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] TransponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }
}
