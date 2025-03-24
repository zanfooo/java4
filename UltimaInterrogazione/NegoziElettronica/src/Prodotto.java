import java.util.ArrayList;

public interface Prodotto {
    void addProdotto(Prodotto prodotto) throws Exception;
    void removeProdotto(int codice);
    ArrayList<Prodotto> ritornaLista() throws CloneNotSupportedException;
    void updateProdotto(int codice, Prodotto prodotto) throws Exception;
}