// Willian Hiroshi da Silva Fukuda Gardini - 2209624

public class EletricoPokemon extends Pokemon implements Atacavel {
    private String cargaDeRaio;
    private String descarga;
    private String relampagoFulminante;
    private String poder;

    public EletricoPokemon() {
        this.cargaDeRaio = cargaDeRaio;
        this.descarga = descarga;
        this.relampagoFulminante = relampagoFulminante;
        this.poder = poder;
    }


    public String getCargaDeRaio() {
        return cargaDeRaio;
    }

    public void setCargaDeRaio(String cargaDeRaio) {
        this.cargaDeRaio = cargaDeRaio;
    }

    public String getDescarga() {
        return descarga;
    }

    public void setDescarga(String descarga) {
        this.descarga = descarga;
    }

    public String getRelampagoFulminante() {
        return relampagoFulminante;
    }

    public void setRelampagoFulminante(String relampagoFulminante) {
        this.relampagoFulminante = relampagoFulminante;
    }
    
    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
}
