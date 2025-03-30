import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {

    public static void lerArquivo(File arquivo) {
        try (FileReader fr = new FileReader(arquivo);
             BufferedReader br = new BufferedReader(fr)) {
            String linhaArquivo;
            while ((linhaArquivo = br.readLine()) != null) {
                System.out.println(linhaArquivo);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
