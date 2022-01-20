import java.util.LinkedList;

public class Zad2 {
    public static <T> void redukuj(LinkedList<T> lista, int n) {
        if(n>1)
            for(int i = n-1; i< lista.size(); i+=n-1)
                lista.remove(i);
        else
            for(int i = 1; i< lista.size(); i++)
                lista.remove(i);
    }
}

