public class Zad8 {
    public static<E, T extends Iterable<E>> void print(T iterable) {
        String str = "";
        for (E item : iterable) {
            str += item.toString() + ", ";
        }
        System.out.println(str.substring(0, str.length() - 2));
        System.out.println("");
    }
}
