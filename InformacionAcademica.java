import java.util.Scanner;

public class InformacionAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
       

        System.out.print("Ingresa tu carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("¿Cuántas asignaturas registrarás? ");
        int nMaterias = scanner.nextInt();
        
       
        String[] asignaturas = new String[nMaterias];
        int[] calificaciones = new int[nMaterias];

        
        for (int i = 0; i < nMaterias; i++) {
            System.out.print("Ingresa nombre de la asignatura #" + (i + 1) + ": ");
            asignaturas[i] = scanner.nextLine();

            System.out.print("Ingresa calificación de " + asignaturas[i] + ": ");
            calificaciones[i] = scanner.nextInt();
            
        }

       
        System.out.println("\nNombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);

       
        for (int i = 0; i < nMaterias; i++) {
            System.out.println((i + 1) + ") " + asignaturas[i] + " = " + calificaciones[i]);
        }

        
        int suma = 0;
        for (int i = 0; i < nMaterias; i++) {
            suma += calificaciones[i];
        }
        double promedio = (double) suma / nMaterias;

        System.out.println("Promedio de calificaciones: " + promedio);

    
        if (promedio >= 60) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        scanner.close();
    }
}
