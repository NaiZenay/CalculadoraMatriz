import java.util.Scanner;

public class Menu {
    public void menu(){
        Matriz matriz = new Matriz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de la operacion a realizar \n" +
                "1)Sumar matrices\n2)Restar matrices");
        int opcionMenu = scanner.nextInt();

        switch (opcionMenu) {
            case 1:
                boolean matrizValida;
                int[][] matrizA;
                int[][] matrizB;
                do {
                    matrizValida=true;
                    matrizA=matriz.crearMatriz() ;
                    matrizB=matriz.crearMatriz() ;

                    if (matriz.getFilas(matrizA) != matriz.getFilas(matrizB) && matriz.getColumnas(matrizA) != matriz.getColumnas(matrizB)){
                        System.out.println("Las matrices no coinciden en tamaño\n" +
                                "La matriz A tiene: "+matriz.getFilas(matrizA)+" filas y "+matriz.getColumnas(matrizA)+" columnas\n"+
                                "La matriz B tiene: "+matriz.getFilas(matrizB)+" filas y "+matriz.getColumnas(matrizB)+" columnas\n"+
                                "Segun el criterio de suma de matrices estas deben de tener el mismo numero de filas y columnas\n\n" +
                                "Ingrese los valores de la matriz de nuevo:\n"
                        );
                        matrizValida=false;
                    }
                }while (!matrizValida);


                int[][] resultado= new int[matrizA.length][matrizA.length];

                for (int i = 0; i < matrizA.length; i++) {
                    for (int j = 0; j < matrizA.length; j++) {
                        resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
                System.out.print("Resultado de suma: \n"+matriz.imprimirMatriz(resultado,matrizB.length,matrizA.length)+"\n -FIN");
                break;



            default:
                System.out.println("Programa finalizado");
                break;
        }
    }

}
