import controllers.PetController;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de cadastro de Pets!");
        System.out.println("Esse é o menu de operações que você pode realizar no sistema");

        File opcoesMenu = new File("sistema-pets/src/resources/opcoes_menu.txt");
        LeitorArquivo.lerArquivo(opcoesMenu);

        try {
            int opcaoEscolhida;
            do {
                System.out.print("Para prosseguir, digite o número da opção que você deseja escolher: ");
                opcaoEscolhida = scanner.nextInt();
                switch (opcaoEscolhida) {
                    case 1:
                        System.out.println("1. Cadastrar um novo pet");
                        System.out.println();
                        System.out.println("Para cadastrar um novo models.Pet, você deve responder as seguintes perguntas:");
                        File formulario = new File("sistema-pets/src/resources/formulario.txt");
                        LeitorArquivo.lerArquivo(formulario);
                        System.out.println("Digite o primeiro nome do pet: ");
                        String nome = scanner.next();
                        scanner.nextLine();
                        System.out.println("Digite o sobrenome nome do pet: ");
                        String sobrenome = scanner.nextLine();
                        System.out.println("Digite o tipo do pet");
                        int tipo = scanner.nextInt();
                        System.out.println("Digite o sexo do pet");
                        String sexo = scanner.next();
                        scanner.nextLine();
                        System.out.println("Digite o nome da rua onde foi encontrado");
                        String rua = scanner.nextLine();
                        System.out.println("Digite o número da casa");
                        String numeroCasa = scanner.nextLine();
                        System.out.println("Digite o nome do bairro");
                        String bairro = scanner.nextLine();
                        System.out.println("Digite a cidade");
                        String cidade = scanner.nextLine();
                        System.out.println("Digite a idade do pet");
                        System.out.println("Se o pet possui menos de 1 ano, indique a quantidade de meses seguido de 0.");
                        String idade = scanner.nextLine();
                        System.out.println("Digite o peso do pet");
                        String peso = scanner.nextLine();
                        System.out.println("Digite a raça do pet");
                        String raca = scanner.nextLine();

                        PetController controller = new PetController();
                        controller.cadastrarNovoPet(nome, sobrenome, tipo, sexo, rua, numeroCasa, bairro, cidade, idade, peso, raca);
                        break;
                    case 2:
                        System.out.println("Alterar os dados de um pet");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Deletar um pet cadastrado");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Listar pets cadastrados");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Listar pets por algum critério");
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Obrigado por utilizar o sistema de Pets. Até mais!");
                        break;
                    default:
                        System.out.println("Número inválido. Digite um novo número");
                        System.out.println();
                }
            } while (opcaoEscolhida != 6);
        } catch (InputMismatchException ex) {
            System.out.println("Programa encerrado!");
            System.out.println("Nesse campo, você não pode digitar letras ou caracteres especiais!");
            System.out.println("Para realizar novas operações no sistema, inicialize o programa novamente e insira um número válido!");
        }
        scanner.close();
    }
}
