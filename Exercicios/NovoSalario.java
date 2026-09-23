import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o plano de trabalho (A, B ou C):");
        String plano = entrada.next();
        System.out.println("Digite o salario atual:");
        double salario = entrada.nextDouble();

        double novoSalario;
        switch (plano) {
            case "A": novoSalario = salario * 1.10; break;
            case "B": novoSalario = salario * 1.15; break;
            case "C": novoSalario = salario * 1.20; break;
            default:
                System.out.println("Plano invalido");
                novoSalario = salario;
        }
        System.out.println("Novo salario: R$ " + novoSalario);
        entrada.close();
    }
}