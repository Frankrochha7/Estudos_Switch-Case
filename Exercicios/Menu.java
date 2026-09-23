import java.util.Scanner;

public class Menu{

public static void main(String[] args){

    System.out.println("Bem vindo ao sistema de cadastro de produtos");
    System.out.println("teste");


System.out.println("===========Menu de Opções=========");
System.out.println( "1 - Cadastrar Produtos");
System.out.println( "2 - Listar Produtos");
System.out.println( "3 - Sair do Sistema");


Scanner entrada = new Scanner(System.in);

int menu =  entrada.nextInt();

switch (menu){
    case 1:
        System.out.println("Você escolheu a opção 1, que é cadastrar produto");
        System.out.println("Que é a opção cadastrar produtos.");
        break;



        case 2:
            System.out.println("Você escolheu a opção 2.");
            System.out.println("Que é lista produtos.");
            break;

            case 3:
                System.out.println("Você escolheu a opção 3.");
                System.out.println("Que é sair do sistema.");
                break;

                default:
                    System.out.println("Item do menu invalido.");




}

entrada.close();
}

    
}