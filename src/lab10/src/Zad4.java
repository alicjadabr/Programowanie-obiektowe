import java.util.LinkedList;

public class Zad4 {
    public static <T> void odwroc(LinkedList<T> lista) {
        for(int i=0; i<lista.size()/2; i++) {
            T temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - i - 1));
            lista.set(lista.size()-i-1, temp);
        }
    }
}
