package backend;

import java.util.Objects;

public class Veicolo {

    private String marca;
    private String modello;
    private int prezzo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", marca, modello, prezzo);
    }

    public Veicolo(String marca, String modello, int prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return Objects.equals(marca, veicolo.marca) && Objects.equals(modello, veicolo.modello);
    }

}
