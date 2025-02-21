public class Ejercicios6 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 10;
        matriz[1][2] = 8;
        matriz[2][0] = 16;
        matriz[2][1] = 11;
        matriz[2][2] = 12;

        int contar_pares = 0;

        System.out.print("Matriz original");
        for(int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contar_pares++;
                }
            }
        }
        System.out.println("\nLa cantidad de números pares en la matriz es: " + contar_pares);
    }
}
