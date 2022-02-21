package org.vlagru;

public class Rectangle extends Object {
    private int height; // modifikatory pristupu private, public, default (kdyz nic), protected
    private int width;

    /*
    konstruktor s jednim parametrem o strane a, vytvorim tedy ctverec
    konstruktor je metoda, skrze niz manipuluji s atributy tridy
    public Rectangle(int a) {
        this.height = this.width = a;
    }
     */

    public Rectangle(int height, int width) { // alt + insert
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() { // vypise parametry
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) { // nastavim si if podminku pro zadavani hodnotu
        if(height>=0){
            this.height = height;
        } else {
            throw new IllegalArgumentException("Hodnota musi byt nezaporna!");
        }

    }

    public void setWidth(int width) {
        if(width>=0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Hodnota musi byt nezaporna!");
        }
    }
}

