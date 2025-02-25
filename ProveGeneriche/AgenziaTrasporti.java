import java.util.ArrayList;

public class AgenziaTrasporti {
    ArrayList<Veicolo> listaVeicoli = new ArrayList<>();

    public void aggiungiVeicolo(Veicolo veicolo) throws Exception {
        if (veicolo != null) {
            listaVeicoli.add(veicolo);
        } else throw new Exception("Il veicolo inserito non è valido");
    }

    public void visualizzaListaVeicoli() throws Exception {
        if (!listaVeicoli.isEmpty()) {
            for (Veicolo veicolo : listaVeicoli) {
                System.out.println(veicolo);
            }
        } else
            throw new Exception("La lista dei veicoli è vuota");
    }
}
