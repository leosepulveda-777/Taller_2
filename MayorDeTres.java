import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número (n1): ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (n2): ");
        int n2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número (n3): ");
        int n3 = scanner.nextInt();

        
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        
        System.out.println("El mayor de los tres es: " + mayor);

        
        scanner.close();
    }
}
