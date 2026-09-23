import java.util.Scanner;

public class SistemaERP {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do produto:");
        int codigo = entrada.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = entrada.nextInt();

        String produto;
        double preco;

        switch (codigo) {
            case 100: produto = "Cachorro Quente"; preco = 39.90; 
            break;

            case 101: produto = "Bauru Simples"; preco = 25.90; 
            break;

            case 102: produto = "Bauru com ovo"; preco = 20.90; 
            break;

            case 103: produto = "Hamburguer"; preco = 115.10090; 
            break;

            case 104: produto = "Cheeseburguer"; preco = 221.90; 
            break;

            case 105: produto = "Refrigerante"; preco = 32.90; 
            break;

            default:
                produto = "Produto invalido";
                preco = 0.0;
        }

        double total = preco * quantidade;

           System.out.println("Produto: " + produto);
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", total));
        entrada.close();
    }
}