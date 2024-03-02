import java.util.Scanner;

public class Menu {
    public int opcion() {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;
        System.out.println("Ingresa el numero de la operacion a realizar \n" +
                "1)Sumar matrices\n" +
                "2)Restar matrices\n" +
                "3)Multiplicacion\n" +
                "4)Multiplicacion Escalar\n" +
                "5)Determinante\n" +
                "Ingresa cualquier letra para terminar el programa");
        try {
            opcionMenu = scanner.nextInt();
        } catch (Exception e) {
            opcionMenu = 99999;
        }
        return opcionMenu;
    }

    public void abrirMenuOperaciones(int opcionMenu) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();
        int[][] matrizA;
        int[][] matrizB;
        switch (opcionMenu) {
            case 0:
                this.abrirMenuOperaciones(this.opcion());
            case 1:
                matrizA = matriz.crearMatriz();
                matrizB = matriz.crearMatriz();
                if (matriz.validacionSumaResta(matrizA, matrizB)) {
                    matriz.suma(matrizA, matrizB);
                } else {
                    this.tryAgain(1);
                }
                this.abrirMenuOperaciones(this.opcion());
                break;
            case 2:
                matrizA = matriz.crearMatriz();
                matrizB = matriz.crearMatriz();
                if (matriz.validacionSumaResta(matrizA, matrizB)) {
                    matriz.resta(matrizA, matrizB);
                } else {
                    this.tryAgain(2);
                }
                this.abrirMenuOperaciones(this.opcion());
                break;
            case 3:
                matrizA = matriz.crearMatriz();
                matrizB = matriz.crearMatriz();
                if (matriz.validacionMultiplicacion(matrizA, matrizB)) {
                    matriz.multiplicacion(matrizA, matrizB);
                } else {
                    this.tryAgain(2);
                }
                this.abrirMenuOperaciones(this.opcion());
                break;
            case 4:
                matrizA = matriz.crearMatriz();
                System.out.println("Ingresa el numero escalar");
                int escalar = scanner.nextInt();
                matriz.multiplicacionEscalar(matrizA, escalar);
                this.abrirMenuOperaciones(this.opcion());
                break;
            case 5:
                matrizA = matriz.crearMatriz();
                matriz.determinante(matrizA);
                this.abrirMenuOperaciones(this.opcion());
                break;
            default:
                System.out.println("Programa finalizado");
                break;
        }
    }

    //Numero de operacion correspondiente en el menu de operaciones
    public void tryAgain(int numeroOperacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseas realizar de nuevo esta operacion?\n" +
                "Ingresa 1 para intentar de nuevo\n" +
                "Ingresa 0 para volver al menu");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            this.abrirMenuOperaciones(numeroOperacion);
        } else {
            this.abrirMenuOperaciones(0);
        }
    }

}
