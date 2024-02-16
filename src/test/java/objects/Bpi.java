package objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Bpi {
    @JsonProperty("USD")
    private Usd usd;
    @JsonProperty("GBP")
    private Gbp gbp;
    @JsonProperty("EUR")
    private Eur eur;

    public Bpi(){

    }
    public Bpi(Usd usd, Gbp gbp, Eur eur) {
        super();
        this.usd = usd;
        this.gbp = gbp;
        this.eur = eur;
    }

    public Usd getUsd() {
        return usd;
    }

    public void setUsd(Usd usd) {
        this.usd = usd;
    }

    public Gbp getGbp() {
        return gbp;
    }

    public void setGbp(Gbp gbp) {
        this.gbp = gbp;
    }

    public Eur getEur() {
        return eur;
    }

    public void setEur(Eur eur) {
        this.eur = eur;
    }
}
