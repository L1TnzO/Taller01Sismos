import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double[][] sismos = new double[7][24];


        while (opcion != 5) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar sismo de mayor magnitud");
            System.out.println("3. Contar sismos mayores o iguales a 5.0");
            System.out.println("4. Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de la opción que desea: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                sismos = ingresarDatos();
            } else if (opcion == 2) {
                double mayorSismo = buscarMayorSismo(sismos);
                System.out.println("Sismo de mayor magnitud: " + mayorSismo);
            } else if (opcion == 3) {
                int contador = contarSismos(sismos);
                System.out.println("Sismos mayores o iguales a 5.0: " + contador);
            } else if (opcion == 4) {
                enviarSMS(sismos);
            } else if (opcion != 5) {
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }
    public static double[][] ingresarDatos() {
        double[][] sismos = new double[7][24];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                sismos[i][j] = Math.random() * 9.9;
            }
        }

        return sismos;
    }

    public static double buscarMayorSismo(double[][] sismos) {
        double mayorSismo = 0;
        int filas = sismos.length;
        int columnas = sismos[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (sismos[i][j] > mayorSismo) {
                    mayorSismo = sismos[i][j];
                }
            }
        }

        return mayorSismo;
    }

    public static int contarSismos(double[][] sismos) {
        int contador = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] >= 5.0) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void enviarSMS(double[][] sismos) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (sismos[i][j] >= 7.0) {
                    System.out.println("Alerta!!! se debe evacuar zona costera!");
                }
            }
        }
    }


}