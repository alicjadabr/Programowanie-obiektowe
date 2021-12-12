import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        File file = new File(args[0]);
        try {
            Scanner plik = new Scanner(file);
            while (plik.hasNextLine()) {
                String line = plik.nextLine();
                lista.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku we wskazanej ścieżce " + file.getAbsolutePath());
        } finally {
            Collections.sort(lista);
            for (String linia : lista) {
                System.out.println(linia);
            }
        }
    }
}


