package lab6;
import java.util.Arrays;
import java.util.Set;

public class IntegerSet {
    private boolean[] tab;

    public IntegerSet() {
        tab = new boolean[100];
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet sumaAB = new IntegerSet();
        for(int i=0; i<100; i++) {
            if(a.tab[i])
                sumaAB.tab[i] = true;
            if(b.tab[i])
                sumaAB.tab[i] = true;
        }
        return sumaAB;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet iloczynAB = new IntegerSet();
        for(int i=0; i<100; i++) {
            if(a.tab[i] && b.tab[i])
                iloczynAB.tab[i] = true;
        }
        return iloczynAB;
    }
    public void insertElement(int x) {
        if(x>0 && x<101)
            this.tab[x] = true;
    }
    public void deleteElement(int x) {
        this.tab[x] = false;
    }
    public String toString() {
        String set = "";
        for (int i = 0; i < 100; i++) {
            if (tab[i])
                set += (i + " ");
        }
        return set;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IntegerSet other = (IntegerSet) obj;
        if(tab == null) {
            if(other.tab != null)
                return false;
        } else if(!tab.equals(other.tab))
            return false;
        return true;
    }

    public static void main(String[] args) {
        IntegerSet zbior1 = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();
        zbior1.insertElement(1);
        zbior1.insertElement(0);
        zbior1.insertElement(8);
        zbior1.insertElement(430);
        zbior1.insertElement(54);
        zbior1.insertElement(12);
        zbior2.insertElement(11);
        zbior2.insertElement(-1);
        zbior2.insertElement(8);
        zbior2.insertElement(21);
        zbior2.insertElement(1);
        zbior2.insertElement(44);
        zbior2.deleteElement(44);


        System.out.println("Zbior A: " + zbior1);
        System.out.println("Zbior B: " + zbior2);
        IntegerSet zbior3 = IntegerSet.union(zbior1, zbior2);
        System.out.println("Zbior A + B: " + zbior3);
        IntegerSet zbior4 = IntegerSet.intersection(zbior1, zbior2);
        System.out.println("Zbior A * B: " + zbior4);
        System.out.println(zbior1.equals(zbior2));

    }
}

