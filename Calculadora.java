import java.util.Scanner;
public class Calculadora {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
String ContinuarCalculo = "sim";

while (ContinuarCalculo.equalsIgnoreCase("sim")) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");


            System.out.print("Digite a opção (1/2/3/4): ");
            int choice = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Resultado: " + result);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.print("Quer fazer outra operação? (sim/não): ");
                ContinuarCalculo = scanner.next();
            }
        }

        System.out.println("Valeu por usar a calculadora!");
        scanner.close();
    }
}
