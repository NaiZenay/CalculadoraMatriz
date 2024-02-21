import java.util.Scanner;

public class Matriz {
    static Scanner scanner = new Scanner(System.in);

    public int[][] crearMatriz() {
        System.out.println("Ingresa el tamaño de las matriz");
        System.out.println("Filas");
        int filas = scanner.nextInt();
        System.out.println("Columnas");
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        llenarMatriz(matriz);
        return matriz;
    }
    public int getFilas(int[][] matriz){
        int filas= matriz.length;
        return filas;
    }
    public int getColumnas(int[][] matriz){
        int columnas=0;
        return columnas=matriz[0].length;
    }
    public void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < this.getFilas(matriz); i++) {
            for (int j = 0; j < this.getColumnas(matriz); j++) {
                System.out.println("Ingresa el valor a guardar en la posicion [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println(imprimirMatriz(matriz));
    }

    public StringBuilder imprimirMatriz(int[][] matriz) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.getFilas(matriz); i++) {
            for (int j = 0; j < this.getColumnas(matriz); j++) {
                stringBuilder.append("\t").append(matriz[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public void suma(int [][] matrizA ,int [][] matrizB ){
        int[][] resultado= new int[matrizA.length][matrizB.length];
        for (int i = 0; i < this.getFilas(matrizA); i++) {
            for (int j = 0; j < this.getColumnas(matrizB); j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.print("Resultado de suma: \n"+this.imprimirMatriz(resultado)+"\n -FIN");
    }

}

