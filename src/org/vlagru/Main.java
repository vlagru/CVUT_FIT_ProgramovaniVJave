package org.vlagru;

public class Main {

    public static void main(String[] args) {

            System.out.println("Nazdar");

        /*

        soubor Program.java
        public - metodu lze zavolat zvenci, pristupna zvenci
        static - funkcni bez instance
        void - nic nevraci
        String[] - parametry (pole stringu bude predano do promenne args)
        spuspteni prekladace do byte-code IDE, ale i 'javac Program.java'
        vysledkem spusteni trida Program.class, lze spustit jako 'java Program'
        stdout - vystup
        package - mala pismena oddelenych teckou 'java.util'
        trida, abstraktni trida, jejich konstruktory, rozhranni - zacina velkym pismenem, konstruktory jako pridavne jmeno
        metoda - camelNotation
        variable - totalCount
        konstanta, final variable - MAX_COUNT, RED

        DATOVE TYPY
        byte ma 8 bitu (binary digits)
        deklarace vzdy, lze var, prekladac odvodi
        int vzdy 32 bitu
        arit operace (+,-,*,/) vysledek int
        relacni operace (==,!=,>,<,>=,<=) vysledek typ boolean
        PRIMITIVNI DT
        byte 8b
        short 16b
        int 32b
        - 2^31 -1 : nejvetsi cislo
        - pozor na preteceni, podteceni : 2 miliardy - 1 miliarda = -1.2 miliary
        - int addExact(int x, int y) v knihovne Math secte, pripadne vykaze vyjimku
        long 64b
        (Racionalni typy : NaN(odm za -cisla),-a+ infinity(3.0/0 nebo -2.0/0) )
        float 32b
        double 64b
        - 1bit znamenkovy, pak exponent (11 bitu), pak mantisa(52 bitu)
        - 15 platnych cifer
        char (obalova trida Character) 16b
        boolean
        void - pomocny prazdny typ

        OPERACE S PRIMITIVNIMI DATOVYMI TYPY
        1. byte + byte = int
        2. short + short = int
        3. int + int = int
        4. long + long = long

        int a = 3;
        a+= ++a + a++ * ++a (a+= 4 + 4 * 6 --- a=31)

        PRIORITY OPERATORU
        DEKLARACE PROMENNYCH
        - 8 primitivnich datovych typu, ostatni jsem tzv. referencni : pole, objekty, retezce,...
        - napr. int a; - lze do ni priradit pouze hodnoty uzsi : byte, short, char

        LITERALY
        primy zapis hodnoty v programu
        int 34, 0x10:16 ...
        double 25.3, 1.2E-3
        boolean false true
        char 'a' '1' '+'
        long 100000000L
        float 4F, 258.52f

        4.7 - 4.7F --- POZOR

        String "abcd" "Nazdar"

        KONSTANTY
        pomoci keyword final (lze i u trid, metod ...)

        - final int MAX = 100;
        - final String NAZEV_PREDMETU = "Programovani v Jave"
        -------- vysvetleni ----------
        (napr. trida String je finalni, nelze od ni odvozovat POTOMKY)
        konstante nelze menit hodnotu ---- Max = 20; // chyba pri prekladu

        JAVADOC
        // komentare uvozene

        TYPOVA KONVERZE
        - implicitni (vyvola se automaticky), explicitni
        - double x; int i = 1;
        - x = i; takto v pohode
        - pozor!!! double d = 9 dlouhyL (vyznamovych typu v double mene nez v longu)

        */
    }
}
