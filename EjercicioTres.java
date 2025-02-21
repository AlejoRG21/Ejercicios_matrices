public class Ejercicio3 {
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

        int mayor = matriz[0][0];

        for(int i = 0; i < 3; i++){
            System.out.print("\n");
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.print("\n");
            for (int j = 0; j < 3; j++){
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.print("El número mayor es: " + mayor);
    }
}
