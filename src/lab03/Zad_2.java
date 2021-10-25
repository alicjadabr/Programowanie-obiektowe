import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Zad_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = in.nextInt();
        if(n>=1 && n <=100){
            int[] tab1 = new int[n];
            generuj(tab1, n, -999, 999);
            System.out.print("tab1: ");
            wypisz(tab1);
            System.out.println("Liczb nieparzystych jest: " + ileNieparzystych(tab1));
            System.out.println("Liczb parzystych jest: " + ileParzystych(tab1));
            System.out.println("Zer jest:  " + ileZerowych(tab1));
            System.out.println("Liczb ujemnych jest:  " + ileUjemnych(tab1));
            System.out.println("Liczb dodatnich jest:  " + ileDodatnich(tab1));
            System.out.println("Maksow jest:  " + ileMaksymalnych(tab1));
            System.out.println("Suma dodatnich:  " + sumaDodatnich(tab1));
            System.out.println("Suma ujemnych:  " + sumaUjemnych(tab1));
            System.out.println("Najdluzszy ciag dodatnich:  " + dlugoscMaksymalnegoCiaguDodatniego(tab1));
            odwrocFragment(tab1, 1, 6);
            signum(tab1);
        }
        else {
            System.out.println("Prosze podac n z zakresu 1-100");
        }
    }

    public static void generuj(int[] tab, int n, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            tab[i] = r.nextInt(max-min)+min;
        }
    }

    public static void wypisz(int[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    public static int ileNieparzystych(int tab[]) {
        int np = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] % 2 != 0) {
                np += 1;
            }
        }
        return np;
    }

    public static int ileParzystych(int tab[]) {
        int p = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] % 2 == 0) {
                p += 1;
            }
        }
        return p;
    }

    public static int ileDodatnich(int tab[]) {
        int dod = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] > 0) {
                dod += 1;
            }
        }
        return dod;
    }

    public static int ileUjemnych(int tab[]) {
        int uj = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] < 0) {
                uj += 1;
            }
        }
        return uj;
    }

    public static int ileZerowych(int tab[]) {
        int zer = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i] == 0) {
                zer += 1;
            }
        }
        return zer;
    }

    public static int ileMaksymalnych(int tab[]) {
        int max = 0;
        int ile = 0;
        for(int i=1; i<tab.length; i++){
            if(tab[i]>tab[max]){
                max = i;
            }
        }
        for(int i = 0; i<tab.length; i++) {
            if(tab[i] == tab[max]) {
                ile += 1;
            }
        }
        return ile;
    }

    public static int sumaDodatnich(int tab[]) {
        int sum = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i]>0) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static int sumaUjemnych(int tab[]) {
        int sum = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i]<0) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static int dlugoscMaksymalnegoCiaguDodatniego(int[] tab) {
        int curr = 0;
        int max_ciag = 0;
        for(int i : tab) {
            if(i>0)
                curr++;
            else
                curr = 0;
            if(max_ciag < curr)
                max_ciag = curr;
        }
        return max_ciag;
    }

    public static void signum(int tab[]) {
        for(int i=0; i<tab.length; i++) {
            if(tab[i]>0) {
                tab[i] = 1;
            }
            else if(tab[i]<0) {
                tab[i] = -1;
            }
        }
        wypisz(tab);
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy) {
        for(int i=lewy; i<=prawy-lewy; i++) {
            int temp = tab[i];
            tab[i] = tab[prawy];
            tab[prawy] = temp;
            prawy--;
        }
        wypisz(tab);
    }
}
