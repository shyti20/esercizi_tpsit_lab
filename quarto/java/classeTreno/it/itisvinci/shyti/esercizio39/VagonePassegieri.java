package it.itisvinci.shyti.esercizio39;

public class VagonePassegieri extends Vagone {
    private String classe;
    private int postiLiberi;
    private int postiOccupati;
    private double pesoMedio = 65;

    public VagonePassegieri() {
        // super();
        classe = "Undefined";
        postiLiberi = 0;
        postiOccupati = 0;
    }

    public VagonePassegieri(String classe, int postiLiberi, int postiOccupati, int codice, double pesoVuoto, String azienda, int anno) {
        super(codice, pesoVuoto,  azienda, anno);
        this.classe = classe;
        this.postiLiberi = postiLiberi;
        this.postiOccupati = postiOccupati;
    }

    public double pesoVagone() {
        return (pesoMedio * postiOccupati) + super.getPesoVuoto();
    }

    public String getClasse() {
        return classe;
    }

    public int getPostiLiberi() {
        return postiLiberi;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setPostiLiberi(int postiLiberi) {
        this.postiLiberi = postiLiberi;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }
}
