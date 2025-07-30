import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("============================================");
            System.out.println("                   MENU                     ");
            System.out.println("============================================");
            System.out.println("1. Cadastrar um novo pet");
            System.out.println("2. Alterar os dados do pet cadastrado");
            System.out.println("3. Deletar um pet cadastrado");
            System.out.println("4. Listar todos os pets cadastrados");
            System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6. Sair");
            System.out.println("SELECIONE A OPÇÃO:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar pet");
                    break;
                case 2:
                    System.out.println("Alterar dados");
                    break;
                case 3:
                    System.out.println("Deletar pet");
                    break;
                case 4:
                    System.out.println("Listar pets");
                    break;
                case 5:
                    System.out.println("Listar pet por critério");
                    break;
                case 6:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Número inválido. Tente novamente!");
            }
        } while(option <= 0 || option > 6);
    }
}
