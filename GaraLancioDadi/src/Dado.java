import java.util.Random;

public class Dado {
    private int nFacce;
    private Random random;

    public Dado() {
        this.nFacce = 6;  // Il dado ha 6 facce per default
        this.random = new Random();
    }

    public int lancia() {
        return random.nextInt(nFacce) + 1;  // Restituisce un numero casuale da 1 a 6
    }
}