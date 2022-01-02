public class PairUtil<T> {

    public static <T> Pair<T> swap(Pair<T> para) {
        Pair newPair = new Pair<>(para.getSecond(), para.getFirst());
        return newPair;
    }
}

