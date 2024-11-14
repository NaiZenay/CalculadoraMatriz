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

    public double[][] crearMatrizD() {
        System.out.println("Ingresa el tamaño de las matriz");
        System.out.println("Filas");
        int filas = scanner.nextInt();
        System.out.println("Columnas");
        int columnas = scanner.nextInt();
        double[][] matriz = new double[filas][columnas];
        llenarMatriz(matriz);
        return matriz;
    }

    public int getFilas(int[][] matriz) {
        int filas = matriz.length;
        return filas;
    }

    public int getColumnas(int[][] matriz) {
        return matriz[0].length;
    }
    public int getFilas(double[][] matriz) {
        int filas = matriz.length;
        return filas;
    }

    public int getColumnas(double[][] matriz) {
        return matriz[0].length;
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
    public void llenarMatriz(double[][] matriz) {
        for (int i = 0; i < this.getFilas(matriz); i++) {
            for (int j = 0; j < this.getColumnas(matriz); j++) {
                System.out.println("Ingresa el valor a guardar en la posicion [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = scanner.nextDouble();
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
    public StringBuilder imprimirMatriz(double[][] matriz) {
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

    public boolean validacionMultiplicacion(double[][] matrizA, double[][] matrizB) {
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
                resultado[i][j] = escalar * matriz[i][j];
            }
        }
        System.out.print("Resultado de multiplicacion escalar: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");
    }

    public void multiplicacion(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[this.getFilas(matrizA)][this.getColumnas(matrizB)];

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < this.getColumnas(resultado); j++) {
                int sumaIJ = 0;
                for (int k = 0; k < this.getFilas(resultado); k++) {
                    sumaIJ += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = sumaIJ;
            }
        }
        System.out.print("Resultado de multiplicacion: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");

    }
    public void multiplicacion(double[][] matrizA, double[][] matrizB) {
        double[][] resultado = new double[this.getFilas(matrizA)][this.getColumnas(matrizB)];

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < this.getColumnas(resultado); j++) {
                double sumaIJ = 0;
                for (int k = 0; k < this.getFilas(resultado); k++) {
                    sumaIJ += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = sumaIJ;
            }
        }
        System.out.print("Resultado de multiplicacion: \n" + this.imprimirMatriz(resultado) + "\n -FIN\n");

    }

    public void factorizacionLU(double[][] matriz) {
        int n = matriz.length;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];

        for (int i = 0; i < n; i++) {
            // Calcular U
            for (int j = i; j < n; j++) {
                double sumaIJ = 0;
                for (int k = 0; k < i; k++) {
                    sumaIJ += L[i][k] * U[k][j];
                }
                U[i][j] = matriz[i][j] - sumaIJ;
            }

            // Calcular L
            for (int x = i + 1; x < n; x++) {
                double sumaIJ = 0;
                for (int k = 0; k < i; k++) {
                    sumaIJ += L[x][k] * U[k][i];
                }
                L[x][i] = (matriz[x][i] - sumaIJ) / U[i][i];
            }

            // Establecer 1 en la diagonal de L
            L[i][i] = 1;
        }

        // Imprimir resultados
        System.out.print("Matriz L:\n" + imprimirMatriz(L) + "\n");
        System.out.print("Matriz U:\n" + imprimirMatriz(U) + "\n");
        multiplicacion(L, U);
    }

        public void determinante ( int[][] matriz){
            int determinante = 0;
            //TODO
            System.out.print("El determinante de la matriz es: " + determinante + "\n" + " -FIN\n");

        }

    }


