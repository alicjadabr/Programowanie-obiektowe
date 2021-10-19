import java.util.Scanner;

public class Zad_2 {
    public static void main(String[] args) {
        // Czesc wspolna wszystkich punktow:
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna: ");
        int n = in.nextInt();
        // Zad.2.2
        /*
        float sum2 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Podaj a" + i + ":");
            float a = in.nextFloat();
            if (a > 0) {
                sum2 += a;
            }
        }
        System.out.println("Podwojona suma dodatnich wyrazow ciagu wynosi: " + (2*sum2));
        */
        // Zad.2.3
        /*
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Podaj a" + i + ":");
            float a = IN.nextFloat();
            if (a > 0) {
                dodatnie += 1;
            } else if (a == 0) {
                zera += 1;
            } else {
                ujemne += 1;
            }
        }
        System.out.println("Wsrod podanych liczb jest: " + zera + " zer, " + dodatnie + " liczb dodatnich i " + ujemne + " liczb ujemnych.");
        */
        // Zad.2.4
        /*
        float[] tab2 = new float[n];
        for(int i=0; i<n; i++){
            System.out.println("Podaj a" + (i+1) + ":");
            float x = in.nextFloat();
            tab2[i] = x;
        }

        int max = 0;
        int min = 0;
        for(int i=1; i<n; i++){
            if(tab2[i]>tab2[max]){
                max = i;
            } else if(tab2[i]<tab2[min]){
                min = i;
            }
        }
        System.out.println("Najwieksza z podanych liczba to: " + tab2[max] + " , a najmniejsza to: " + tab2[min]);
        */
        // Zad.2.5
        /*
        float tab2[] = new float[n];
        for(int i=0; i<n; i++) {
            System.out.println("Podaj a" + (i + 1) + ":");
            float x = in.nextFloat();
            tab2[i] = x;
        }

        int pary = 0;
        for(int i=0; i<n-1; i++){
            if(tab2[i]>0 && tab2[i+1]>0){
                pary += 1;
            }
        }
        System.out.println("Mamy " + pary + " takich par liczb.");
        */
    }
}