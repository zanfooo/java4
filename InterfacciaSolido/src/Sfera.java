public class Sfera implements CorpoSolido{
    private double raggio;

    protected Sfera(double raggio) {
        this.raggio = raggio;
    }

    public double volume() {
        return (double) (4 / 3) * Math.PI * Math.pow(raggio, 3);
    }

    public double superficie() {
        return (double) 4 * Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Sono una sfera, la mia superficie è: %.2f e il mio volume è: %.2f" + superficie() + volume());
    }
}
