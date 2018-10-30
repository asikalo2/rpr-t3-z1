package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;

    MobilniBroj (int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    @Override
    public String ispisi() {
        String str = Integer.toString(mobilnaMreza);
        return ("06" + str + "/" + broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.mobilnaMreza, this.broj);
    }
}
