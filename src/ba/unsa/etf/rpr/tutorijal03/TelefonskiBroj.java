package ba.unsa.etf.rpr.tutorijal03;

/*Apstraktna klasa TelefonskiBroj sadrži javnu apstraktnu metodu String ispisi()
koja vraća broj u tekstualnoj formi pogodnoj za ispis, te apstraktnu metodu int hashCode() objašnjenu na predavanjima.
Iz ove klase izvedene su sljedeće klase:

FiksniBroj sadrži konstruktor FiksniBroj(Grad grad, String broj).
Parametar broj je dio telefonskog broja bez pozivnog broja npr. "123-456",
a grad je promjenljiva pobrojanog tipa koji označava pozivni broj koji treba koristiti npr.:
	enum Grad { SARAJEVO, TUZLA, ZENICA…}
Spisak pozivnih brojeva se može naći ovdje. Umjesto imena kantona koristite ime glavnog grada kantona (kao u primjeru iznad),
a umjesto Brčko distrikta stavite BRCKO. Metoda ispisi() treba vratiti broj oblika "033/123-456".
MobilniBroj ima konstruktor MobilniBroj(int mobilnaMreza, String broj) pri čemu oznaka mobilne mreže
 predstavlja drugu i treću cifru pozivnog broja tj. 60-67 (detaljnije informacije možete naći na istoj stranici).
 Metoda ispisi vraća broj istog oblika "061/987-654".
MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string drzava sadrži
 kompletan pozivni broj za državu npr. "+387".*/

public abstract class TelefonskiBroj {

    public abstract String ispisi();

    public abstract int hashCode();

}
