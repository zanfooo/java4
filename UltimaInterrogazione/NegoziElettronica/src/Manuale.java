import java.util.ArrayList;

public class Manuale extends Libro {
    private String argomento;

    public Manuale(String nome, String descrizione, String autore, int isbn, int prezzo, int quantita, String argomento) {
        super(nome, descrizione, autore, isbn, prezzo, quantita);
        this.argomento = argomento;
    }

    @Override
    public String toString() {
        return super.toString() + " , Argomento: " + argomento;
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
