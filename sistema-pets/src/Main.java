import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File formulario = new File("sistema-pets/src/formulario.txt");

        try (FileReader fr = new FileReader(formulario);
             BufferedReader br = new BufferedReader(fr)) {
            String pergunta;
            while((pergunta = br.readLine()) != null){
                System.out.println(pergunta);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}