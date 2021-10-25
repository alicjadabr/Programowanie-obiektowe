import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Zad_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj m: ");
        int m = in.nextInt();
        System.out.println("Podaj n: ");
        int n = in.nextInt();
        System.out.println("Podaj k: ");
        int k = in.nextInt();
        if(m >= 1 && m <= 10 && n >= 1 && n <= 10 && k >= 1 && k <= 10){
            int[][] a = new int[m][n];
            int[][] b = new int[n][k];
            generuj(a, 10);
            System.out.println("Tablica a: \n");
            wypisz(a);
            System.out.println("\nTablica b: \n");
            generuj(b, 10);
            wypisz(b);
            System.out.println("\nTablica c: \n");
            iloczyn(a, b, m, n, k);
        }
    }

    public static void generuj(int[][] tab, int max) {
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = r.nextInt(max);
            }
        }
    }

    public static void wypisz(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void iloczyn(int tab1[][], int tab2[][], int m, int n, int k) {
        int[][] c = new int[m][k];
        for(int i=0; i<m; i++) {
            for(int j=0; j<k; j++) {
                int res = 0;
                for(int l=0; l<n; l++) {
                    res += tab1[i][l] * tab2[l][j];
                    c[i][j] = res;
                }
            }
        }
        wypisz(c);
    }
}