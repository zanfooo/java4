package backend;

public class Automobile extends Veicolo {
    private int nPorte;

    public Automobile(String marca, String modello, int prezzo, int nPorte) {
        super(marca, modello, prezzo);
        this.nPorte = nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }

    public Automobile(String marca, String modello, int prezzo) {
        super(marca, modello, prezzo);
    }

    @Override
    public String toString() {
        return String.format("%d ", nPorte);
    }
}
