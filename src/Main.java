
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuPrincipal();
        System.out.println("Fin de Programa ...");
    }

    public static void menuPrincipal() {

        boolean menu = true;
        while (menu) {
            System.out.println(" ");
            System.out.println("***********************************************");
            System.out.println("                 Menu Principal            ");
            System.out.println("***********************************************");
            System.out.println("1. Mayor de Dos Números");
            System.out.println("2. Pirámide Impar");
            System.out.println("3. Opcion 3");
            System.out.println("0. Salir");
            Scanner Sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("********Ingrese una opcion: *******");
            System.out.println("");
            String opcion = Sc.nextLine();

            switch (opcion) {
                case "1":
                    numeroMayorDeDos();
                    break;
                case "2":
                    piramide();
                    break;
                case "3":
                    break;
                case "0":
                    menu = false;
                    break;
                default:
            }

        }
    }

    public static void numeroMayorDeDos() {
        Scanner numeros = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese primer número: ");
        num1 = numeros.nextInt();
        System.out.println("Ingrese Segundo número: ");
        num2 = numeros.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es:" + num1);
        } else {
            System.out.println("El número mayor es:" + num2);
            System.out.println(" ");
        }
    }

    public static void piramide() {
        Scanner reader = new Scanner(System.in);
        int pisos = 0;
        System.out.println("Ingrese numero: ");
        pisos = reader.nextInt();
        if (pisos % 2 == 0) {
            System.out.println("No se pueden usar números pares");
            System.out.println(" ");
        } else {
            for (int i = 1; i <= pisos; i++) {
                for (int j = 1; j <= pisos - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (i * 2) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
