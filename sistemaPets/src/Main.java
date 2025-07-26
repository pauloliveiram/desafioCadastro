import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File formulario = new File("resources/formulario.txt");
        try(FileReader fr = new FileReader(formulario);
            BufferedReader br = new BufferedReader(fr)) {
                String linha;
                while((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}