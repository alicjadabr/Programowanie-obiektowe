import java.util.LinkedList;

public class Zad3 {
    public static void odwroc (LinkedList<String> lista) {
        for(int i=0; i<lista.size()/2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(lista.size()-i-1));
            lista.set(lista.size()-i-1, temp);
        }
    }
}
