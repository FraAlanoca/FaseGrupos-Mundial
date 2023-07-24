
public class Ronda {
    private Integer NumeroRonda;
    private Partido partido;

    public Ronda() {

    }

    public Ronda(Integer numeroRonda){
        this.NumeroRonda = numeroRonda;

    }

    public Integer getNumeroRonda() {
        return NumeroRonda;
    }

    public void setNumeroRonda(Integer numeroRonda) {
        NumeroRonda = numeroRonda;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}

