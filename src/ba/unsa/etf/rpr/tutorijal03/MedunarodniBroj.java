package ba.unsa.etf.rpr.tutorijal03;

/*MedunarodniBroj ima konstruktor MedunarodniBroj(String drzava, String broj) pri čemu string
drzava sadrži kompletan pozivni broj za državu npr. "+387".
 */

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    MedunarodniBroj(String drzava1, String broj1){
    this.drzava=drzava1;
    this.broj=broj1;
    }

    @Override
    public final String ispisi() {
        return (this.drzava + "/" + this.broj);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.drzava, this.broj);
    }
}
