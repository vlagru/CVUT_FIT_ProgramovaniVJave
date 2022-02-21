package org.vlagru;

/**
 * OOP obdelnik, 2. prednaska
 */

public class MainRectangle {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(6,8);
        System.out.println(rectangle.toString());// lze bez metody .toString(), automaticky bezi na pozadi
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        System.out.println(rectangle);
        rectangle.setHeight(-1);
        rectangle.setWidth(-5);
        System.out.println(rectangle);


    }
}
