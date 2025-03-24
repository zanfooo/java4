import java.util.ArrayList;

public class Negozio implements Prodotto {

    private ArrayList<Prodotto> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    @Override
    public void addProdotto(Prodotto prodotto) throws Exception {
        if (prodotto != null) {
            if (!(prodotti.contains(prodotto)))
                prodotti.add(prodotto);
            else
                throw new Exception("Prodotto già presente.");
        } else {
            throw new NullPointerException("Il prodotto non può essere nullo.");
        }
    }

    @Override
    public void removeProdotto(int codice) {
        for (Prodotto p : prodotti) {
            if (p instanceof ProdottoElettronico && ((ProdottoElettronico) p).getCodiceProdotto() == codice) {
                prodotti.remove(p);
                System.out.println("Prodotto elettronico rimosso con successo.");
                return;
            } else if (p instanceof Libro && ((Libro) p).getIsbn() == codice) {
                prodotti.remove(p);
                System.out.println("Manuale rimosso con successo.");
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    @Override
    public ArrayList<Prodotto> ritornaLista() throws CloneNotSupportedException {
        ArrayList<Prodotto> temp = new ArrayList<>();
        for (Prodotto p : prodotti) {
            temp.add(p);
        }
        return temp;
    }

    @Override
    public void updateProdotto(int codice, Prodotto prodotto) throws Exception {
        boolean trovato = false;
        for (int i = 0; i < prodotti.size(); i++) {
            Prodotto p = prodotti.get(i);
            if (p instanceof ProdottoElettronico && ((ProdottoElettronico) p).getCodiceProdotto() == codice) {
                prodotti.set(i, prodotto);
                trovato = true;
                System.out.println("Prodotto elettronico aggiornato.");
                return;
            } else if (p instanceof Libro && ((Libro) p).getIsbn() == codice) {
                prodotti.set(i, prodotto);
                trovato = true;
                System.out.println("Manuale aggiornato.");
                return;
            }
        }
        if (!trovato) {
            throw new Exception("Prodotto non trovato.");
        }
    }
}
