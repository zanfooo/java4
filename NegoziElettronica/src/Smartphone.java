class Smartphone extends ProdottoElettronico {
    private String modello;
    private int memoria;

    public Smartphone(String codice, String marca, double prezzo, String modello, int memoria) {
        super(codice, marca, prezzo);
        if (memoria <= 0) throw new IllegalArgumentException("La memoria deve essere maggiore di 0 GB.");
        this.modello = modello;
        this.memoria = memoria;
    }

    public String getModello() {
        return modello;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modello: " + modello + ", Memoria: " + memoria + "GB";
    }
}