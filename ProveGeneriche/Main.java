import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgenziaTrasporti agenzia = new AgenziaTrasporti();

        Veicolo veicolo1 = new Veicolo("Audi", "RS7");
        Veicolo veicolo2 = new Veicolo(veicolo1);
        Moto moto1 = new Moto("Yamaha", "jamamai", 10);

//        System.out.println(veicolo1);
//        System.out.println(veicolo2);


        try {
            agenzia.aggiungiVeicolo(veicolo1);
            agenzia.aggiungiVeicolo(veicolo2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            agenzia.visualizzaListaVeicoli();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(moto1.toString());

    }
}
