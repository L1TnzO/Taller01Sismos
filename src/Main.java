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
    public static void ingresarDatos(String[] args){
        System.out.println("Datos ingresados.");
    }

    public static void buscarMayorSismo(String[] args){
        System.out.println("Sismos buscados");
    }

    public static void contarSismos(String[] args){
        System.out.println("Sismos contados.");
    }

    public static void enviarSMS(String[] args){
        System.out.println("Alerta");
    }

}