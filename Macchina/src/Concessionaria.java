import java.util.ArrayList;
import java.util.Objects;

public class Concessionaria {
    private ArrayList<Veicolo> officina = new ArrayList<>();

    public ArrayList<Veicolo> getOfficina() {
        return officina;
    }

    public void setOfficina(ArrayList<Veicolo> officina) {
        this.officina = officina;
    }

    public void aggiungiVeicolo(Veicolo veicolo, ArrayList<Veicolo> listaVeicoli) throws Exception{
        if (veicolo == null) {
            throw new Exception("VEICOLO NON VALIDO!");
        } else {
            listaVeicoli.add(veicolo);
        }
    }
}
