public class Ejercicio4 {
    public static void main(String[] args) {
        int matriz[][] = new int[2][2];

        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 8;

        int  escalar = 2;

        System.out.print("Matriz original");
        for(int i = 0; i < 2; i++) {
            System.out.print("\n");
            for (int j = 0; j < 2; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\nMatriz después de multiplicarla por el escalar " + escalar + ":");
        for(int i = 0; i < 2; i++) {
            System.out.print("\n");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] * escalar + " ");
            }
        }
    }
}
