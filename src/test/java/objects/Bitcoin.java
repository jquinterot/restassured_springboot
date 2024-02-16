package objects;


import org.springframework.stereotype.Component;

@Component
public class Bitcoin {

    private Time time;
    private String disclaimer;
    private String chartName;
    private Bpi bpi;

    public Bitcoin() {
        // default constructor
    }
    public Bitcoin(Time time, String disclaimer, String chartName, Bpi bpi) {
        super();
        this.time = time;
        this.disclaimer = disclaimer;
        this.chartName = chartName;
        this.bpi = bpi;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public Bpi getBpi() {
        return bpi;
    }

    public void setBpi(Bpi bpi) {
        this.bpi = bpi;
    }
}







