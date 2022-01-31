package nr156921.E01.Z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Z2 <T>{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(55);
        printWithSemicolon(list.stream());
        System.out.println();
        printWithSemicolon(arr.stream());
    }

    public static <T extends Iterable<T>> void printWithSemicolon(Stream obj) {
        obj.forEach(e -> System.out.print(e + " ; "));
    }
}
