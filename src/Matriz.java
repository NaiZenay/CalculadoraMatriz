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

    public int getFilas(int[][] matriz) {
        int filas = matriz.length;
        return filas;
    }

    public int getColumnas(int[][] matriz) {
        int columnas = 0;
        return columnas = matriz[0].length;
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

    public boolean validacionSumaResta(int[][] matrizA, int[][] matrizB) {
        boolean matrizValida = true;
        if ((this.getFilas(matrizA) != this.getFilas(matrizB)) || (this.getColumnas(matrizA) != this.getColumnas(matrizB))) {
            System.out.println("Las matrices no coinciden en tamaño");
            System.out.println(
                    "La matriz A tiene: " + this.getFilas(matrizA) + " filas y " + this.getColumnas(matrizA) + " columnas\n" +
                            "La matriz B tiene: " + this.getFilas(matrizB) + " filas y " + this.getColumnas(matrizB) + " columnas\n" +
                            "Segun el criterio de suma y resta de matrices estas deben de tener el mismo numero de filas y columnas\n"
            );
            matrizValida = false;
        }
        return matrizValida;
    }

    public boolean validacionMultiplicacion(int[][] matrizA, int[][] matrizB) {
        boolean matrizValida = true;
        if ((this.getColumnas(matrizA) != this.getFilas(matrizB))) {
            System.out.println("Las matrices no coinciden en tamaño");
            System.out.println(
                    "La matriz A tiene: " + this.getFilas(matrizA) + " filas y " + this.getColumnas(matrizA) + " columnas\n" +
                            "La matriz B tiene: " + this.getFilas(matrizB) + " filas y " + this.getColumnas(matrizB) + " columnas\n" +
                            "Segun el criterio de multiplicacion de matrices estas deben de tener el mismo numero de columnas en la primer matriz que de filas en la segunda\n"
            );
            matrizValida = false;
        }
        return matrizValida;
    }

    public void suma(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizB.length];
        for (int i = 0; i < this.getFilas(matrizA); i++) {
            for (int j = 0; j < this.getColumnas(matrizB); j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.print("Resultado de suma: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");
    }

    public void resta(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizB.length];
        for (int i = 0; i < this.getFilas(matrizA); i++) {
            for (int j = 0; j < this.getColumnas(matrizB); j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        System.out.print("Resultado de resta: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");
    }

    public void multiplicacionEscalar(int[][] matriz, int escalar) {
        int[][] resultado = new int[this.getFilas(matriz)][this.getColumnas(matriz)];
        for (int i = 0; i < this.getFilas(matriz); i++) {
            for (int j = 0; j < this.getColumnas(matriz); j++) {
                resultado[i][j] = escalar*matriz[i][j];
            }
        }
        System.out.print("Resultado de multiplicacion escalar: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");
    }

    public void multiplicacion(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[this.getFilas(matrizA)][this.getColumnas(matrizB)];
        //TODO
        System.out.print("Resultado de multiplicacion: \n"+this.imprimirMatriz(resultado)+"\n -FIN\n");

    }

}


