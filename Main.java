import src.employees.Employees;
import src.employees.Syndicate;
import java.util.Scanner;
import java.lang.String;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o sistema para folha de pagamento.");    
        Scanner input = new Scanner(System.in);

        System.out.println("Ações:"); // printar aos poucos?
        System.out.println("1 - Adicionar empregado"); 
        System.out.println("2 - Remoção empregado"); 
        System.out.println("3 - Lançar um cartão"); 
        System.out.println("4 - Lançar resultado venda");
        System.out.println("5 - Lançar taxa serviço"); 
        System.out.println("6 - Alterar detalhes"); 
        System.out.println("7 - Folha de pagamento para hoje");
        System.out.println("8 - Undo/redo");
        System.out.println("9 - Agendar pagamento");
        System.out.println("10 - Criar novas agendas");
        System.out.println("0 - Encerrar");

        int comando = input.nextInt();

        Employees employees = new Employees(500);
        //Syndicate syndicate = new Syndicate(500);

        while (comando != 0){
            if (comando == 1) {
                System.out.println("Adicionando empregado:"); 
                employees.add();
                //System.out.println("Esse empregado irá fazer parte do Sindicato?\n1 - Sim\n2 - Não\n");
                /*int isSyndicate = input.nextInt();
                if(isSyndicate == 1) {
                    Syndicate add_syndicate = new Syndicate(name, adress, method, id); // resolver como passar essas variaveis??
                } else {
                    System.out.println("Okay.\n");
                }*/
            } else if (comando == 2) {
                //remove();
                System.out.println("Removendo empregado..."); 
            } else if (comando == 3) {
                //
            } else if (comando == 4) {
                //
            } else if (comando == 5) {
                //
            } else if (comando == 6) {
                //
            } else if (comando == 7) {
                //
            } else if (comando == 8) {
                //
            } else if (comando == 9) {
                //
            } else {
                //
            }
            System.out.println("11 - Ver as opções novamente\n0 - Encerrar");
            comando = input.nextInt();
            if (comando == 11) {
                System.out.println("1 - Adicionar empregado"); 
                System.out.println("2 - Remoção empregado"); 
                System.out.println("3 - Lançar um cartão"); 
                System.out.println("4 - Lançar resultado venda");
                System.out.println("5 - Lançar taxa serviço"); 
                System.out.println("6 - Alterar detalhes"); 
                System.out.println("7 - Folha de pagamento para hoje");
                System.out.println("8 - Undo/redo");
                System.out.println("9 - Agendar pagamento");
                System.out.println("10 - Criar novas agendas");
                System.out.println("0 - Encerrar");
            }
            input.nextLine();
        }
        input.close();
    }
}
