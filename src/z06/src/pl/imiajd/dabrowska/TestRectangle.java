package pl.imiajd.dabrowska;

public class TestRectangle {
    public static void main(String[] args) {
        BetterRectangle r1 = new BetterRectangle(1, 2, 15,2);
        BetterRectangle r2 = new BetterRectangle(0, 7, 10,5);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}
