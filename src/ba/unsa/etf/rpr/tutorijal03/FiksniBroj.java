package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad {SARAJEVO, TUZLA, ZENICA}

    private String broj;
    private Grad grad;

    FiksniBroj(Grad grad1, String broj1){
        this.broj = broj1;
        this.grad = grad1;

    }

    public final Grad getGrad() {
        return grad;
    }

    @Override
    public final String ispisi() {
        return getKodGrada(this.grad) + "/" + this.broj;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.grad, this.broj);
    }

    public final String getKodGrada(Grad grad1){
        switch (grad1) {
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
