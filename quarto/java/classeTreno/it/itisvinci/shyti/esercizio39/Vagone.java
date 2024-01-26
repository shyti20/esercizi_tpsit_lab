package it.itisvinci.shyti.esercizio39;

public abstract class Vagone {
    private int codice;
    private double pesoVuoto;
    private String azienda;
    private int anno;
    
    public Vagone() {
        codice = 0;
        pesoVuoto = 0;
        azienda = "Undefined";
        anno = 0;
    }

    public Vagone(int codice, double pesoVuoto, String azienda, int anno) {
        this.codice = codice;
        this.pesoVuoto = pesoVuoto;
        this.azienda = azienda;
        this.anno = anno;
    }

    public abstract double pesoVagone();

    public int getAnno() {
        return anno;
    }

    public String getAzienda() { return azienda; }

    public int getCodice() { return codice; }

    public double getPesoVuoto() { return pesoVuoto; }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setPesoVuoto(double pesoVuoto) {
        this.pesoVuoto = pesoVuoto;
    }

}
