import Circulo.Circulo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido al menu para calcular areas");
            System.out.println("Selecciona alguna de las siguientes opciones");
            System.out.println("\n1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectangulo");
            System.out.println("4. Triangulo");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Circulo c = new Circulo();
                    System.out.println("Ingresa el radio: ");
                    c.setR(sc.nextDouble());
                    System.out.println("Area del circulo: " + c.calcularArea());
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }while (opcion != 5);

    }
}