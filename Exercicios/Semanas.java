import java.util.Scanner;

public class Semanas {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7");

        int numero = entrada.nextInt();

        switch(numero) {

            case 1: System.err.println("Domindo");
            break;

            case 2: System.err.println("Segunda-Feira");
            break;
            
            case 3: System.err.println("Terça-Feira");
            break;

            case 4: System.err.println("Quarta-Feira");
            break;

            case 5: System.err.println("Quinta-Feira");
            break;

            case 6: System.err.println("Sexta-Feira");
            break;

            case 7: System.err.println("Sábado");
            break;

            default: System.err.println("Número invalido");

        }

        entrada.close();

        
    }
    
}
