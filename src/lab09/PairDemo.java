import java.util.ArrayList;

public class PairDemo {

    public static void main(String[] args)
    {
        Pair<String> para = new Pair<>("Tom", "Jerry");
        System.out.println(para.getFirst() + " " + para.getSecond());
        para.swap();
        System.out.println(para.getFirst() + " " + para.getSecond());
    }
}
