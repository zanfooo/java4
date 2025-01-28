public class Moto extends Veicolo{
    private int cilindrata;

    public Moto(String marca, String modello, int prezzo, int cilindrata) {
        super(marca, modello, prezzo);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Moto(String marca, String modello, int prezzo) {
        super(marca, modello, prezzo);
    }

    @Override
    public String toString() {
        return String.format("%d ", cilindrata);
    }

}
