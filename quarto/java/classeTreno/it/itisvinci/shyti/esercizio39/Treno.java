package it.itisvinci.shyti.esercizio39;
import java.util.Arrays;

public class Treno {
    private Vagone[] newVagone = new Vagone[0];

    public Treno() {
        newVagone = new Vagone[0];
    }

    public void addVagonePassegieri(VagonePassegieri vp) {
        Arrays.copyOf(newVagone, newVagone.length + 1);
        newVagone[newVagone.length - 1] = vp;
    }

    public void addVagoneMerci(VagoneMerci vm) {
        Arrays.copyOf(newVagone, newVagone.length + 1);
        newVagone[newVagone.length - 1] = vm;
    }
    
    public double pesoTreno() {
        
    }
}
