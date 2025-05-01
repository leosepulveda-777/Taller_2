import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int num = scanner.nextInt();

       
        for (int i = 1; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }

        
        scanner.close();
    }
}
