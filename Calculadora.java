import java.util.Scanner;

public class Calculadora {

    /* área para a criação dos métodos */
    public static void main(String[] args) {

        int v1, v2;
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Insira valores inteiros:");
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        scanner.close();

        System.out.printf("Soma: %d\nDivisao: %d\n", calc.add(v1, v2), calc.div(v1, v2));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
