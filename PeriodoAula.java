import java.util.Scanner;//Aqui pego uma info de fora 

public class PeriodoAula {// Isso é a classe princiapal, Lembra da caixa maior é ele
    public static void main(String[] args) {//Aqui é sla oq Especial, outra caixa grande, mas essa vai dentro da maior

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o periodo (M, V ou N):");
        char periodo = entrada.next().charAt(0);

        switch (periodo) {
            case 'M': System.out.println("Bom dia"); break;
            case 'V': System.out.println("Boa tarde"); break;
            case 'N': System.out.println("Boa noite"); break;
            default: System.out.println("Periodo invalido");
        }
        entrada.close();
    }
}