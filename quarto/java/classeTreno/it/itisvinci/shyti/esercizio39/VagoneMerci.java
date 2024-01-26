package it.itisvinci.shyti.esercizio39;

public class VagoneMerci extends Vagone {
    private double volumeCarico;
    private double pesoMax;
    private double pesoEff;

    public VagoneMerci() {
        volumeCarico = 0;
        pesoEff = 0;
        pesoMax = 0;
    }

    public VagoneMerci(int codice, double pesoVuoto, String azienda, int anno, double volumeCarico, double pesoMax, double pesoEff) {
        super(codice, pesoVuoto, azienda, anno);
        this.volumeCarico = volumeCarico;
        this.pesoMax = pesoMax;
        this.pesoEff = pesoEff;
    }

    public double pesoVagone() {
        return pesoEff + super.getPesoVuoto();
    }

    public double getPesoEff() {
        return pesoEff;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public double getVolumeCarico() {
        return volumeCarico;
    }

    public void setPesoEff(double pesoEff) {
        this.pesoEff = pesoEff;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public void setVolumeCarico(double volumeCarico) {
        this.volumeCarico = volumeCarico;
    }
}
