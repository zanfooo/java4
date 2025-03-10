abstract public class ProdottoElettronico {
    private int codiceProdotto;
    private String marca;
    private int prezzo;

    @Override
    public String toString() {
        return String.format("Il codice del prodotto è: %d, La marca è: %s, Il prezzo è: %d") + codiceProdotto + marca + prezzo;
    }
}
