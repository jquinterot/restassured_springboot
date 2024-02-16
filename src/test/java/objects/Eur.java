package objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Eur {

    private String code;
    private String symbol;
    private String rate;
    private String description;

    @JsonProperty("rate_float")
    private Double rateFloat;


    public Eur() {
    }


    public Eur(String code, String symbol, String rate, String description, Double rateFloat) {
        super();
        this.code = code;
        this.symbol = symbol;
        this.rate = rate;
        this.description = description;
        this.rateFloat = rateFloat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRateFloat() {
        return rateFloat;
    }

    public void setRateFloat(Double rateFloat) {
        this.rateFloat = rateFloat;
    }

}

