import java.time.LocalDate;
import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args){
        Integer nums1[] = { 1, 22, 31, 44, 49, 52, 80, 123, 321, 999};
        Integer nums2[] = { 5, 21, 14, 13, 10, 8, 4, 20, 17, 7};
        LocalDate date1[] = {LocalDate.of(1995, 2, 14), LocalDate.of(2015, 11, 2), LocalDate.of(2013, 5, 7)};
        LocalDate date2[] = {LocalDate.of(1995, 2, 13), LocalDate.of(1995, 2, 17), LocalDate.of(1995, 3, 17)};

        System.out.println(isSorted(nums1));
        System.out.println(isSorted(nums2));
        System.out.println(isSorted(date1));
        System.out.println(isSorted(date2));
        System.out.println(binSearch(nums1, 123));
        System.out.println(binSearch(date2, LocalDate.of(1995, 3, 17)));

        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(date1));
        selectionSort(nums2);
        selectionSort(date1);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(date1));
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i].compareTo(array[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] array, T ob) {
        Arrays.sort(array);
        int first = 0;
        int last = array.length-1;
        int mid = (first + last)/2;
        while(first <= last) {
            int key = ob.compareTo(array[mid]);
            if(key > 0) {
                first = mid+1;
                mid = (first + last)/2;
            }
            if(key < 0) {
                last = mid - 1;
                mid = (first + last) / 2;
            }
            if(key == 0) {
                return mid;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for(int i=0; i<array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if(array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}


