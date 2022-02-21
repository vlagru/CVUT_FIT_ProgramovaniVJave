package org.vlagru;

/**
 * cvicny vypocet stran obdelniku pred prechodem na OOP, 2. prednaska
 */
public class MainRectangular {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(); // konstruktor bez parametru - implicitni konstruktor, nemam ho vytvoreny
        rectangular.width = rectangular.height = 12; // dosadim si sem hodnoty
        System.out.println(rectangular.height + " * " + rectangular.width);
    }
}
