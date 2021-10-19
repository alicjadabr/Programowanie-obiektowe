import java.util.Scanner;

public class Zad_1 {
    // silnia dla punktu i
    public static int silnia(int n){
        int res = 1;
        for(int i=1; i<=n; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args){
        // pobranie wartosci n od uzytkownika
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna: ");
        int n = in.nextInt();
        // deklaracja zmiennych dla wynikow podpunktow
        float sum_a = 0;
        float il_b = 1;
        float sum_c = 0;
        float sum_d = 0;
        float il_e = 1;
        float sum_f = 0;
        float res_h = 0;
        float res_i = 0;

        // petla do wczytania wyrazow ciagu
        for(int i=1; i<=n; i++){
            System.out.println("Podaj a" + i + ":");
            float a = in.nextFloat();
            sum_a += a; // a)
            il_b *= a;  // b)
            sum_c += Math.abs(a); // c)
            sum_d += Math.sqrt(Math.abs(a)); // d)
            il_e *= Math.abs(a); // e)
            sum_f += Math.pow(a, 2); // f)
            if (i % 2 == 0) {
                res_h -= a;
                res_i += a / silnia(i);
            } else {
                res_h += a;
                res_i -= a / silnia(i);
            }
        }
        // wyswietlenie wynikow
        System.out.println("a) Suma wyrazow tego ciagu wynosi: " + sum_a);
        System.out.println("b) Iloczyn wyrazow tego ciagu wynosi: " + il_b);
        System.out.println("c) Suma bezwglednych wartosci wyrazow tego ciagu wynosi: " + sum_c);
        System.out.println("d) Suma pierwiastkow z bezwglednych wartosci wyrazow tego ciagu wynosi: " + sum_d);
        System.out.println("e) Iloczyn bezwglednych wartosci wyrazow tego ciagu wynosi: " + il_e);
        System.out.println("f) Suma wyrazow tego ciagu podniesionych do kwadratu wynosi: " + sum_f);
        System.out.println("g) Wynik: " + sum_a + " i " + il_b);
        System.out.println("h) Wynik: " + res_h);
        System.out.println("i) Wynik: " + res_i);


        // Zad.1.2
        /*
        float[] tab = new float[n];
        for(int i=0; i<n; i++) {
            System.out.println("Podaj a" + (i + 1) + ":");
            float a = in.nextFloat();
            tab[i] = a;
        }

        for (int i=1; i<n; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.print(tab[0] + ".");
        */
    }
}



