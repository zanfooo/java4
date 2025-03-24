import java.util.ArrayList;

public class Smartphone extends ProdottoElettronico {

    private String modello;
    private int memoria;

    public Smartphone(int codiceProdotto, String marca, int prezzo, String modello, int memoria) {
        super(codiceProdotto, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    public String getModello() {
        return modello;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Memoria: " + memoria;
    }

    @Override
    public void addProdotto(Prodotto prodotto) throws Exception {

    }

    @Override
    public void removeProdotto(int codice) {

    }

    @Override
    public ArrayList<Prodotto> ritornaLista() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void updateProdotto(int codice, Prodotto prodotto) throws Exception {

    }
}