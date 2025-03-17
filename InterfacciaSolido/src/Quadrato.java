public class Quadrato implements CorpoSolido {
    private double lato;

    protected Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double volume() {
        return 0;
    }

    public double superficie() {
        return (double) 6 * Math.pow(lato, 2);
    }

    @Override
    public String toString() {
        return String.format("Sono un quadrato, la mia superficie è: %d e il mio volume è: %d" + superficie() + volume());
    }
}
