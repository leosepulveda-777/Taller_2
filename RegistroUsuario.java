import java.util.Scanner;

class Usuario {
    String nombre;
    int edad;
    String estado;

    Usuario(String nom, int ed, String est) {
        nombre = nom;
        edad = ed;
        estado = est;
    }
}

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos usuarios deseas registrar? ");
        int total = scanner.nextInt();

        Usuario[] usuarios = new Usuario[total];

        for (int i = 0; i < total; i++) {
            System.out.println("\nRegistro del usuario #" + (i + 1));

            System.out.print("Ingresa nombre: ");
            String nombre = scanner.next(); // No usamos nextLine

            System.out.print("Ingresa edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingresa estado (Activo/Inactivo): ");
            String estado = scanner.next();

            usuarios[i] = new Usuario(nombre, edad, estado);
        }

        int mayores = 0;
        int menores = 0;

        System.out.println("\n--- Información de los usuarios ---");
        for (int i = 0; i < total; i++) {
            if (usuarios[i].edad >= 18) {
                System.out.println(usuarios[i].nombre + " – Edad: " + usuarios[i].edad + " – Estado: " + usuarios[i].estado + " – MAYOR de edad");
                mayores++;
            } else {
                System.out.println(usuarios[i].nombre + " – Edad: " + usuarios[i].edad + " – Estado: " + usuarios[i].estado + " – MENOR de edad");
                menores++;
            }
        }

        System.out.println("\n--- Resumen ---");
        System.out.println("Total de usuarios registrados: " + total);
        System.out.println("Usuarios mayores de edad: " + mayores);
        System.out.println("Usuarios menores de edad: " + menores);

        scanner.close();
    }
}
