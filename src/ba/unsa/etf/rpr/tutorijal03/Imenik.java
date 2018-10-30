package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

/*void dodaj(String ime, TelefonskiBroj broj)
String dajBroj(String ime) - vraća telefonski broj osobe pod imenom ime u formi stringa pozivajući metodu ispisi() klase
TelefonskiBroj,
String dajIme(TelefonskiBroj broj) - vraća ime osobe čiji telefonski broj je broj - i ova operacija treba koristiti HashMapu,
tring naSlovo(char s) - vraća sve brojeve u telefonskom imeniku za osobe čije ime počinje na slovo s u formatu:
1. Ime Prezime - broj
2. Ime Prezime - broj
…
Set<String> izGrada(Grad g) - vraća skup Stringova koji sadrži imena i prezimena svih osoba koje žive u gradu g
(istog pobrojanog tipa koji je dat u klasi FiksniBroj), što se može saznati ako osoba ima fiksni broj telefona u tom gradu.
Pri tome skup treba biti sortiran abecedno.
Set<TelefonskiBroj> izGradaBrojevi(Grad g) - vraća brojeve za osobe iz grada g. Ovaj skup treba biti sortiran po
stringu koji se dobije metodom ispisi().

*/
public class Imenik {

    private HashMap<String, TelefonskiBroj> imenik;

    Imenik() {
        imenik = new HashMap<String, TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    String dajBroj(String ime){
        return imenik.get(ime).ispisi();

    }

    String dajIme(TelefonskiBroj broj){
        return null;
    }

    String naSlovo(char s){
        return null;

    }

    Set<String> izGrada(FiksniBroj.Grad g){
        Set set = imenik.entrySet();
        Set<String> rezultat = new HashSet<String>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            if (mentry.getValue() instanceof FiksniBroj) {
                FiksniBroj temp = (FiksniBroj) mentry.getValue();
                String broj = (String) mentry.getKey();
                if (temp.getGrad() == g) {
                    rezultat.add(broj);
                }
            }
        }
        return rezultat;
    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        return null;
    }
}
