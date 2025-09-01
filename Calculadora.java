import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

    /* área para a criação dos métodos */
    public static void main(String[] args) {

        int v1 = 0, v2 = 0;
        boolean validInput;
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Insira valores inteiros:");

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("v1= ");
                v1 = scanner.nextInt();
                System.out.print("v2= ");
                v2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("\nInsira apenas valores inteiros.");
                scanner.next();
            }
        }
        scanner.close();

        System.out.printf("Soma: %d\nDivisao: %s\n", calc.add(v1, v2),
                (v2 != 0 ? String.valueOf(calc.div(v1, v2)) : "Erro: divisão por zero."));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
