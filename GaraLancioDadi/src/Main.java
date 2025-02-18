import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione dei giocatori
        System.out.print("Inserisci il nome del primo giocatore: ");
        String nomeGiocatore1 = scanner.nextLine();
        System.out.print("Inserisci il nome del secondo giocatore: ");
        String nomeGiocatore2 = scanner.nextLine();

        Giocatore giocatore1 = new Giocatore(nomeGiocatore1);
        Giocatore giocatore2 = new Giocatore(nomeGiocatore2);

        // Creazione del dado con 6 facce
        Dado dado = new Dado();

        // Definizione del numero di round
        System.out.print("Inserisci il numero di round da giocare: ");
        int roundTotali = scanner.nextInt();

        // Creazione della gara
        Gara gara = new Gara(giocatore1, giocatore2, roundTotali, dado);

        // Esecuzione della gara
        while (gara.isGaraInCorso()) {
            System.out.println("\nInizia un nuovo round...");
            gara.round();
        }

        // Fine della gara
        System.out.println("\nRisultato finale:");
//        System.out.println("Vincitore: " + gara.getWinner());
        gara.gameWin();


        scanner.close();
    }
}
