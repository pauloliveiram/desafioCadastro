import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
                        System.out.println("Cadastrar um novo pet");
                        System.out.println();
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
            System.out.println("Você não pode digitar letras ou caracteres especiais!");
            System.out.println("Para realizar novas operações no sistema, inicialize o programa novamente e insira um número válido!");
        }

    }
}
