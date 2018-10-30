package ba.unsa.etf.rpr.tutorijal03;

/*MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string
drzava sadrži kompletan pozivni broj za državu npr. "+387".
 */

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    MedunarodniBroj(String drzava, String broj){
    this.drzava=drzava;
    this.broj=broj;
    }

    @Override
    public String ispisi() {
        return (this.drzava + "/" + this.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.drzava, this.broj);
    }
}
