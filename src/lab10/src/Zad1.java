import java.util.LinkedList;

public class Zad1 {
    public static void redukuj(LinkedList<String> pracownicy, int n) {
        if(n>1)
            for(int i = n-1; i<pracownicy.size(); i+=n-1)
                pracownicy.remove(i);
        else
            for(int i = 1; i<pracownicy.size(); i++)
                pracownicy.remove(i);
    }
}
