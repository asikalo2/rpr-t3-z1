package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;

    MobilniBroj (int mobilnaMreza1, String broj1){
        this.mobilnaMreza=mobilnaMreza1;
        this.broj=broj1;
    }

    @Override
    public final String ispisi() {
        String str = Integer.toString(mobilnaMreza);
        return ("0" + str + "/" + broj);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.mobilnaMreza, this.broj);
    }
}
