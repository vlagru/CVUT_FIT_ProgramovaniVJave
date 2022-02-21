package org.vlagru;

public class LectureNo2 {
    public static void main(String[] args) {

        /*
        *Objekty vznikaji v halde, nikoliv v zasobniku, muze se rozsirovat v prubehu programu, pro toto prepinace
        *kod tridy, vytvorim objekt, trida predek, potomek, public class main - co trida, to soubor
        *set a list - rozdil, iterator - v Jave vnitrni trida (has next, next), vidi meze pole, has next, jestli se nesnazim sahnout mimo upozorni
        * -- toto vnitrni trida, neporusuje se zapouzdreni
        * top level urovne tridy - tyto uplne vlevo, pouze jedna muze byt public, tato se vyvazi ven
        * rodic a potomek - 1 urovnove dedeni, predek viceurovnove
        * staticky vs instancni inicializator
        * vse z instancnich ini lze dat do konstruktoru, staticky nelze nahradit nicim
        * soucatsi potomka je sve, co ma predek, pak ma metody, ty jsou v def tridy
        * nejdriv nacteni statickych definic + inicializace statickych atributu, pak se pojede klasicky, pak inicial predka, konstruktor predka a teprve potom k potomkovi
        * zanoreni 3 tak akorat, 7 uz na povazenou
        * metoda init neni final, nekdo v potomkovi je přepíše int()
        * v konstruktoru nevolat inicializační metody
        * virtuální vazba - v předkovi definovanz metody a jak je používat, vola se az dobe prekladu
        * public, static, void, main pro vstup do programu
        * metoda sfx() viditelna pouze zevnitr
        * atributy vzycky statickou vazbu
        *
        * PREDNAsKA
        * klíčová slova dle užití
        * byte + byte = int
        * 1 < 8 < 12 == true(1<8)<12 = blbost
        * char 2 bity
        * modifikatory pristupu pouyit pred metodu, atribut, ne pred lokalni promennou (public, private, protected, "friend", private)
        * final - pred tridou, neda se z no dedit, v praxi chujovina, muze byt i u metod -- nelze je prepsat potomkovi --
        * -- vs. private u metody, final muze byt u atributu, tedz konstanta --
        * -- napr. private final int id, id pak uz nelze menit, musi se u vseho psat, dale u lokalnich promenny
        * -- final double diskriminant = ... --- final rika, ted bude resit 2 koreny. ale dis se uz nezmeni
        * static --- muze byt u importu --- import--rozsiruje jmenny prostor o tento podkus
        * --- java.util.Arraylist =
        * static import javalang.Math --- pak jen sin()
        * u premennych transient a volatile --- transient --- nechci serializovat, volatile --- aby se promenna necashovala
        * --- souvisi s rychlosti procesoru
        * do swtiche int jako parametr avse co se da na int prevest, STring, byte, short
        * break ukonci cely program, continue --- ukonci a vrati se na podminku
        *   operator --- instanceod --- zjistuje jestli objekt je nejakeho typu
        * this - chci pristoupit k atributu te tridy, ve ktere jsem, this() --- vola jinz konstruktor teze tridy
        * super --- vola konstruktor trudy predka
        * extends --- jsem potomkem nejake tridy
        * const a goto --- nefunkcni
        * atributy private, metody public --- modifikatory pristupu
        * zpravidla konstruktory elame vzdy public
        * overloading konstruktoru/metod  --- napr podle parametru rozliseni
        * vzajemne volani konstruktoru pomoci metody this
        * halda heap, zasobnik stack
        * Runtime.getRuntime().gc(); --- probudim linou uklizecku
        *
         */
    }
}
