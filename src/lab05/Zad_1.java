import java.util.*;

public class Zad_1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> new_array = new ArrayList<Integer>();
        new_array.addAll(a);
        new_array.addAll(b);

        return new_array;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size_a = a.size();
        int size_b = b.size();
        ArrayList<Integer> new_array = new ArrayList<Integer>();

        int bigger_size = 0;
        if(size_a>size_b) {
            bigger_size = size_a;
        } else {
            bigger_size = size_b;
        }
        for(int i=0; i<bigger_size; i++) {
            if(i<size_a) {
                new_array.add(a.get(i));
            }
            if(i<size_b) {
                new_array.add(b.get(i));
            }
        }
        return new_array;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> new_array = new ArrayList<Integer>();
        Collections.sort(a);
        Collections.sort(b);
        int k=0;
        int l=0;
        while(k<a.size() && l<b.size()) {
            if (a.get(k) < b.get(l)) {
                new_array.add(a.get(k));
                k++;
            }
            else if (a.get(k) > b.get(l)) {
                new_array.add(b.get(l));
                l++;
            }
            else {
                new_array.add(a.get(k));
                new_array.add(b.get(l));
                k++;
                l++;
            }
        }
        if(k == a.size()) {
            for(int i=l; i<b.size(); i++) {
                new_array.add(b.get(l));
                l++;
            }
        }
        else if (l == b.size()){
            for(int i=k; i<a.size(); i++) {
                new_array.add(a.get(k));
                k++;
            }
        }
        return new_array;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> new_array = new ArrayList<Integer>();
        for(int i=a.size()-1; i>=0; i--) {
            new_array.add(a.get(i));
        }
        return new_array;
    }

    public static void reverse(ArrayList<Integer> a) {
        for(int i=0; i<a.size()/2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(a.size()-1-i));
            a.set((a.size()-1-i), temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr_a = new ArrayList<Integer>();
        arr_a.add(22);
        arr_a.add(2);
        arr_a.add(55);
        ArrayList<Integer> arr_b = new ArrayList<Integer>();
        arr_b.add(7);
        arr_b.add(1);
        arr_b.add(64);
        arr_b.add(27);
        arr_b.add(2);


        ArrayList<Integer> arr_1 = append(arr_a, arr_b);
        System.out.println("Zad.1 : " + arr_a.toString() + " + " + arr_b.toString() + " = " + arr_1.toString());
        ArrayList<Integer> arr_2 = merge(arr_a, arr_b);
        System.out.println("Zad.2 : " + arr_a.toString() + " + " + arr_b.toString() + " = " + arr_2.toString());
        ArrayList<Integer> arr_3 = mergeSorted(arr_a, arr_b);
        System.out.println("Zad.3 : " + arr_3.toString());
        ArrayList<Integer> arr_4 = reversed(arr_b);
        System.out.println("Zad.4 : " + arr_b.toString() + " - odwrocona nowa lista: " + arr_4.toString());
        reverse(arr_b);
        System.out.println("Zad.5 : Lista b po odwroceniu " + arr_b.toString());

    }
}


