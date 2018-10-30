package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad {SARAJEVO, TUZLA, ZENICA};

    private String broj;
    private Grad grad;

    FiksniBroj(Grad grad, String broj){
        this.broj = broj;
        this.grad = grad;

    }

    @Override
    public String ispisi() {
        return getKodGrada(this.grad) + "/" + this.broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.grad, this.broj);
    }

    public String getKodGrada(Grad grad){
        switch (grad) {
            case SARAJEVO:
                return "033";

            case TUZLA:
                return "035";

            case ZENICA:
                return "032";

            default:
                return null;
        }
    }
}
