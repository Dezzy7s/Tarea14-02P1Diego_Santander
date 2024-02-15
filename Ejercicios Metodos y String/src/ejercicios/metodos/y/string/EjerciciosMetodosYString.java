package ejercicios.metodos.y.string;

import java.util.Scanner;

public class EjerciciosMetodosYString {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un Ejercicio");
            System.out.println("1. Replace");
            System.out.println("2. Factorial");
            System.out.println("3. Mensajes");
            System.out.println("4. Promedios");
            System.out.println("5. Aprobado o reprobado");
            System.out.println("6. Contains");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Replace");
                    Replace();
                    break;
                case 2:
                    System.out.println("Ha seleccionado Factorial");
                    factorial();
                    break;
                case 3:
                    System.out.println("Ha seleccionado Mensajes");
                    mensajes();
                    break;
                case 4:
                    System.out.println("Ha seleccionado Promedios");
                    Promedios();
                    break;
                case 5:
                    System.out.println("Ha seleccionado AprobadoReprobado");
                    AprobadoReprobado();
                    break;
                case 6:
                    System.out.println("Ha seleccionado Contains");
                    Contains();
                    break;
                case 7:
                    System.out.println("Hasta la Proxima :D");
                    break;
                default:
                    System.out.println("Ingrese un valor valido porfavor :d");
            }
        } while (opcion != 7);
    }

    public static void Replace() {
        String cadenaOg = "holaaaa";
        char caracter1 = 'a';
        char caracter2 = 'b';

        String caracteresReemplazadados = miMetodoDeReemplazo(cadenaOg, caracter1, caracter2);

        System.out.println("Cadena original: " + cadenaOg);
        System.out.println("Cadena reemplazada: " + caracteresReemplazadados);
    }

    public static String miMetodoDeReemplazo(String cadena, char Reemplazar, char nuevoCaracter) {
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == Reemplazar) {
                caracteres[i] = nuevoCaracter;
            }
        }
        return new String(caracteres);
    }

    public static void factorial() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n = entrada.nextInt();

        long factorial = calcularFactorial(n);

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        if (n < 0) {
            System.out.println("Valor invalido");
            return -1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void mensajes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un mensaje:");
        String mensaje = scanner.nextLine();
        System.out.println("El mensaje es: " + mensaje);

    }

    public static void Promedios() {
        double promedio = PromedioNotas();
        System.out.println("El promedio de notas es: " + promedio);
    }

    public static double PromedioNotas() {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;

        for (int x = 1; x <= 4; x++) {
            System.out.print("Ingrese la nota " + x + ": ");
            double nota = entrada.nextDouble();
            suma += nota;
        }

        double promedio = suma / 4;
        return promedio;
    }

    public static void AprobadoReprobado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota = entrada.nextInt();

        boolean aprobado = Aprobacion(nota);

        if (aprobado) {
            System.out.println("El alumno aprobo.");
        } else {
            System.out.println("El alumno reprobo :c.");
        }
    }

    public static boolean Aprobacion(int nota) {
        if (nota >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void Contains() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la Cadena Principal: ");
        String cadena1 = entrada.nextLine();
        System.out.println("Ingrese la Subcadena: ");
        String subcadena = entrada.nextLine();

        boolean resultado = Contains(cadena1, subcadena);

        if (resultado) {
            System.out.println("La cadena principal contiene la subcadena.");
        } else {
            System.out.println("La cadena principal no contiene la subcadena.");
        }
    }

    public static boolean Contains(String cadena1, String subcadena) {
        return cadena1.contains(subcadena);
    }

}
