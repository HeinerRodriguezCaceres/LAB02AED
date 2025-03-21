package Ejercicios;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de dato: 1. Integer  2. Double");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            ejecutarOperacionesInteger(scanner);
        } else if (tipo == 2) {
            ejecutarOperacionesDouble(scanner);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void ejecutarOperacionesInteger(Scanner scanner) {
        System.out.println("Ingrese un número entero:");
        Integer num = scanner.nextInt();
        OperacionesMatInteger op = new OperacionesMatInteger(num);
        menuOperaciones(scanner, op);
    }

    private static void ejecutarOperacionesDouble(Scanner scanner) {
        System.out.println("Ingrese un número decimal:");
        Double num = scanner.nextDouble();
        OperacionesMatDouble op = new OperacionesMatDouble(num);
        menuOperaciones(scanner, op);
    }

    private static <E extends Number> void menuOperaciones(Scanner scanner, Operable<E> op) {
        int opcion;
        do {
            System.out.println("Menú de Operaciones:");
            System.out.println("1. Suma\n2. Resta\n3. Producto\n4. División\n5. Potencia\n6. Raíz Cuadrada\n7. Raíz Cúbica\n8. Salir");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.println("Ingrese el otro operando:");
                E num = leerNumero(scanner, op);
                ejecutarOperacion(op, opcion, num);
            } else if (opcion == 6) {
                System.out.println("Resultado: " + op.raizCuadrada());
            } else if (opcion == 7) {
                System.out.println("Resultado: " + op.raizCubica());
            }
        } while (opcion != 8);
        System.out.println("Programa finalizado.");
    }

    private static <E extends Number> E leerNumero(Scanner scanner, Operable<E> op) {
        if (op instanceof OperacionesMatInteger) {
            return (E) Integer.valueOf(scanner.nextInt());
        } else if (op instanceof OperacionesMatDouble) {
            return (E) Double.valueOf(scanner.nextDouble());
        } else {
            throw new IllegalArgumentException("Tipo no soportado");
        }
    }

    private static <E> void ejecutarOperacion(Operable<E> op, int opcion, E num) {
        switch (opcion) {
            case 1: System.out.println("Resultado: " + op.suma(num)); break;
            case 2: System.out.println("Resultado: " + op.resta(num)); break;
            case 3: System.out.println("Resultado: " + op.producto(num)); break;
            case 4: System.out.println("Resultado: " + op.division(num)); break;
            case 5: System.out.println("Resultado: " + op.potencia(num)); break;
        }
    }

}
