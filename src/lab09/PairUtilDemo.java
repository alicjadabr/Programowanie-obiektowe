public class PairUtilDemo {
    public static void main(String[] args)
    {
        Pair<String> para = new Pair<>("Tom", "Jerry");
        System.out.println(para.getFirst() + " " + para.getSecond());
        Pair<String> nowaPara = PairUtil.swap(para);
        System.out.println(nowaPara.getFirst() + " " + nowaPara.getSecond());
    }
}
