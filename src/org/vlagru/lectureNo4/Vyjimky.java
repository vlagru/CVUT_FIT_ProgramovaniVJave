package org.vlagru.lectureNo4;

public class Vyjimky {

    /**
     * chyba uvnitr programu, nebo zvenci (poskrabane CD)
     * vyjimky jsou objekty, rikaji co a jak se spatne stalo
     * podstrom tridy Throwable
     * checked : IO exceptions
     * unchecked : nember format exception, sahnuti mimo pole
     * checked exceptions : nedokaze efektivne obslouzit
     * --- napr. poskrabane CD, ale programator by mel navrhnout, aby se tomuto
     * vyvaroval
     * --- pozaduje osetreni : try-catch-fanally, nebo toto je nebezpecna metoda
     * --- muze hazet vyjimku - 'throw'
     * unchecked : programatorovi chyby, napr. pri spatnem prevodu cisla na retezec
     * !!!!!!!!!!!! java.lang.RuntimeException : !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * --- java.lang.ArithmeticException : deleni nulou
     * --- java.lang.NullPointerException
     * --- java.lang.IndexOutOfBoundsException : sahnuti mimo pole
     * trida Throwable metody : String toString() a String getMessage()
     * -----------------------------------------------------------------
     * priklad vyznacovani vyjimek :
     * public void m(...) throws IOException,
     *      MyException1, ... {
     *}
     * ------------------------------------------------------------------
     * @Throws : do javadocu se pisi vyhazovane vyjimky
     * ------------------------------------------------------------------
     * Vytvoreni vlastni vyjimky (ukazka) :
     *
     * public class TableException extends Exception {
     *     // konstruktor vytvori vlastni zpravu i explicitni indikaci
     *     public TableException(int row, int col) {
     *         super.("Wrong item at: " + row + " " + col);
     *         this.row = row, this.col = col;
     *     }
     * }
     * ------------------------------------------------------------------
     * Vyjimka se vytvori a vyhodi napr. takto :
     * throw new TableException(333 --- row , 7 --- col);
     * ------------------------------------------------------------------
     *
     */
}
