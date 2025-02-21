import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int res[][] = new int[2][2];
        int limite, i, j;

        System.out.println("Ingrese elemntos de la primera matriz: ");
        for(i = 0; i < 2; i++){
          for(j = 0; j < 2; j++){
              System.out.println("Columna " + (i + 1 ) + " fila " + (j + 1) + "= ");
              mat1[i][j] = lector.nextInt();
          }
        }

        System.out.println("Ingrese los elementos de la segunda matriz: ");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                System.out.println("Columna " + (i + 1) + " fila " + (j + 1) + "= ");
                mat2[i][j] = lector.nextInt();
            }
        }

        System.out.println("La suma de las dos matrices es: ");
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                System.out.println("Columna " + (i + 1) + " Fila " + (j + 1) + "= " + res[i][j]);
            }
        }
    }
}
