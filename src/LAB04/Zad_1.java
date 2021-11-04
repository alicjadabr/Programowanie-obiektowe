import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String str = in.nextLine();
        System.out.println("Podaj znak: ");
        char ch = in.next().charAt(0);
        System.out.println("a) W podanym napisie znak " + ch + " wystepuje " + countChar(str, ch) + " razy.");
        System.out.println("c) Srodek wyrazu to: " + middle(str));
        System.out.println("f) Po zamianie mala <-> wielka: " + change(str));
        System.out.println("g) Po wstawieniu apostrofow: " + nice(str));
        System.out.println("h) Podaj wlasny znak do wstawienia: ");
        char ch_g = in.next().charAt(0);
        System.out.println("h) Podaj co ile pozycji wstawic twoj znak do napisu: ");
        int x_g = in.nextInt();
        System.out.println("h) Po wstawieniu twojego znaku: " + ch_g + " co " + x_g + " pozcyję, otrzymamy: " + nice_2(str, ch_g, x_g));
        System.out.println("d) Ile czlonow dolaczyc: ");
        int n = in.nextInt();
        System.out.println("d) " + repeat(str,n));
        System.out.println("b) Podaj napis: ");
        String str2 = in.next();
        System.out.println("b) Podaj szukany napis: ");
        String subs = in.next();
        System.out.println("b) W podanym napisie " + str2 + " napis " + subs + " wystepuje " + countSubStr(str2, subs) + " razy.");
        System.out.println("e) Tablica indeksow substringa: ");
        for(int e : where(str2, subs)) {
            System.out.println(e + " ");
        }
    }

    public static int countChar(String str, char c) {
        int ile_c = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==c) {
                ile_c++;
            }
        }
        return ile_c;
    }

    public static int countSubStr(String str, String subStr) {
        int index = 0;
        int count = 0;
        while (true)
        {
            index = str.indexOf(subStr, index);
            if (index != -1)  // -1 jesli znak nie zostanie znaleziony
            {
                count ++;
                index ++;
            }
            else {
                break;
            }
        }
        return count;
    }

    public static String middle(String str) {
        String mid = new String();
        int len = str.length();
        if (len % 2 != 0) {
            char c = str.charAt((((len+1)/2)-1));
            mid = String.valueOf(c);
        }
        else {
            char c1 = str.charAt(len/2-1);
            char c2 = str.charAt(len/2);
            mid = new StringBuilder().append(c1).append(c2).toString();
        }
        return mid;
    }

    public static String repeat(String str, int n ) {
        StringBuilder con = new StringBuilder(str);
        for(int i=1; i<=n; i++) {
            con.append(str);
        }
        return con.toString();
    }

    public static int[] where(String str, String subStr) {
        int index = 0;
        int count = 0;
        int[] temp = new int[100];
        int x = 0;
        while (true)
        {
            index = str.indexOf(subStr, index);
            if (index != -1)
            {
                temp[x] = index;
                count ++;
                index ++;
                x++;
            }
            else {
                break;
            }
        }
        int[] tab = new int[count];
        for(int i=0; i<count; i++) {
            tab[i] = temp[i];
        }
        return tab;
    }

    public static String change(String str) {
        StringBuffer str2 = new StringBuffer();
        for(int i=0; i<str.length(); i++) {
            char x = str.charAt(i);
            if(Character.isUpperCase(x)) {
                x = Character.toLowerCase(x);
            }
            else {
                x= Character.toUpperCase(x);
            }
            str2.append(x);
        }
        return str2.toString();
    }

    public static String nice(String str) {
        StringBuffer str2 = new StringBuffer(str);
        for(int i=(str2.length()-3); i>0; i = i -3) {
            str2.insert(i, "\'");
        }
        return str2.toString();
    }

    public static String nice_2(String str, char sep, int x) {
        StringBuffer str2 = new StringBuffer(str);
        for(int i=(str2.length()-x); i>0; i -= x) {
            str2.insert(i, sep);
        }
        return str2.toString();
    }




}
