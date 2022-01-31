package nr156921.E01.Z3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class Z3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj sciezke do interesujacego Cie katalogu: ");
        String strPath = sc.nextLine();
        System.out.println("Podaj rozszerzenie: ");
        String roz = sc.nextLine();
        int len = strPath.length();
        Path path = Path.of(strPath);
        showFiles(path, len, roz);
    }

    public static void showFiles(Path path, int lenPath, String roz) throws IOException {
        Stream<Path> list = Files.list(path);
        list.toList().stream().filter(e -> e.toString().endsWith(roz))
                .forEach(e -> System.out.println(e.toString().substring(lenPath+1)));
    }


}
