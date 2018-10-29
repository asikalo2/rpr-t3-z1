package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;

    MobilniBroj (int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }

    public String Ispisi(){
        String str = Integer.toString(mobilnaMreza);
        return (str + "/" + broj);
    }
}
