import java.io.File;

public class Formulario {
    public static void main(String[] args) {
        File formulario = new File("sistema-pets/src/resources/formulario.txt");

        LeitorArquivo.lerArquivo(formulario);
    }
}