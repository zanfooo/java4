public class Moto extends Veicolo {
    private int cilindrata;

    public Moto(String marca, String modello, int cilindrata) {
        super(marca, modello);
        this.cilindrata = cilindrata;
    }

    public Moto(Veicolo veicolo, int cilindrata) {
        super(veicolo);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return super.toString() + " , Cilindrata: " + cilindrata;
    }
}
