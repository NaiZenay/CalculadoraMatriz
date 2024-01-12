import java.util.Scanner;

public class Matriz {
    public int[][] getMatriz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa le tamaño de las matriz");
        System.out.println("Filas");
        int filas = scanner.nextInt();
        System.out.println("Columnas");
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        llenarMatriz(matriz, filas, columnas);
        return matriz;
    }
    public void llenarMatriz(int[][] matriz, int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingresa el valor a guardar en la posicion [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println(imprimirMatriz(matriz, filas, columnas));
    }

    public StringBuilder imprimirMatriz(int[][] matriz, int filas, int columnas) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                stringBuilder.append("\t").append(matriz[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

}

