import java.util.Scanner;

public class Menu {
    public int opcion() {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;
        System.out.println("Ingresa el numero de la operacion a realizar \n" +
                "1)Sumar matrices\n2)Restar matrices\nIngresa cualquier letra para terminar el programa");
        try {
            opcionMenu = scanner.nextInt();
        } catch (Exception e) {
            opcionMenu=99999;
        }
        return opcionMenu;
    }

    public void abrirMenuOperaciones(int opcionMenu) {
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
