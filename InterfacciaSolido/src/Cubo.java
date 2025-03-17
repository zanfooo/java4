public class Cubo implements CorpoSolido{
    private double lato;

    protected Cubo(double lato) {
        this.lato = lato;
    }

    public double volume() {
        return Math.pow(lato, 3);
    }

    public double superficie() {
        return (double) 6 * Math.pow(lato, 2);
    }

    @Override
    public String toString() {
        return super.toString() + "Sono un cubo, la mia superficie è: %d e il mio volume è: %d" + superficie() + volume();
    }
}
