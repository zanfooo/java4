import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        Quadrato quadrato = new Quadrato(5);
        Cubo kubo = new Cubo(6);
        Sfera sferaebbasta = new Sfera(7);

        System.out.println(quadrato.superficie());
        System.out.println(kubo.volume());
        System.out.println(sferaebbasta.superficie());
        System.out.println(sferaebbasta.volume());

        Quadrato quadratoAnonimo = new Quadrato(76) {
            @Override
            public String toString() {
                return "Sono un quadrato anonimo, il mio volume è: %.2f e la mia superficie è: %.2f" + volume() + superficie();
            }
        };

        System.out.println(quadratoAnonimo.toString());
    }
}