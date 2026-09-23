import java.util.Scanner;

public class OperacaoNumerico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = entrada.nextDouble();
        System.out.println("Escolha a operacao (M, S, P ou D):");
        String opcao = entrada.next();

        switch (opcao) {
            case "M":
                System.out.println("Media: " + ((num1 + num2) / 2));
                break;
            case "S":
                System.out.println("Diferenca: " + (Math.max(num1, num2) - Math.min(num1, num2)));
                break;
            case "P":
                System.out.println("Produto: " + (num1 * num2));
                break;
            case "D":
                System.out.println("Divisao: " + (num1 / num2));
                break;
            default:
                System.out.println("Opcao invalida");
        }
        entrada.close();
    }
}