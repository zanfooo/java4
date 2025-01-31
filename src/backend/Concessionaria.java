package backend;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

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
    public void visualizzaVeicoli(ArrayList<Veicolo> listaVeicoli){
        System.out.println(listaVeicoli);
        listaVeicoli.forEach(System.out::println);
    }
    public void modificaVeicolo(ArrayList<Veicolo> listaVeicoli){

    }
    public void eliminaVeicolo(ArrayList<Veicolo> listaVeicoli, String vecchiaMarca, String vecchioModello){

        Optional<Veicolo> risultato = listaVeicoli.stream().filter(veicolo -> veicolo.getMarca().equalsIgnoreCase(vecchiaMarca) && veicolo.getModello().equalsIgnoreCase(vecchioModello)).findAny();
        risultato.ifPresent(veicolo -> System.out.println("Trovato: " + veicolo));
        listaVeicoli.removeIf(veicolo -> veicolo.getMarca().equalsIgnoreCase(vecchiaMarca) && veicolo.getModello().equalsIgnoreCase(vecchioModello));
        listaVeicoli.forEach(System.out::println);
    }
}
