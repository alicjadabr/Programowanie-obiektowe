package pl.imiajd.dabrowska;

import java.awt.Rectangle;

public class BetterRectangle extends java.awt.Rectangle {
    public BetterRectangle(int x, int y, int width, int height){
        super(x,y,width,height);
        /* Kod zakomentowany po zrobieniu modyfikacji z zad.7
        this.setLocation(x, y);
        this.setSize(width, height);
         */
    }
    public double getPerimeter() {
        System.out.print("Obwod wynosi: ");
        return 2*this.getWidth() + 2*this.getHeight();
    }
    public double getArea() {
        System.out.print("Pole wynosi: ");
        return this.getWidth()*this.getHeight();
    }
}
