public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 10, 8},
                {16, 11, 12}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] resultado = sumaMatriz(matriz1, matriz2);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatriz(int[][] m1, int[][] m2) {
        int[][] suma = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return suma;
    }
}
