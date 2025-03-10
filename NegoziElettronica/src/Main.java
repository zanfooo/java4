import utility.Tools;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NegozioElettronica negozio = new NegozioElettronica();

        String[] opzioniMenu = {
                "Gestione Negozio di Elettronica",
                "Inserire nuovo smartphone",
                "Rimuovere prodotto",
                "Cercare prodotto per codice",
                "Modificare prezzo prodotto",
                "Visualizzare tutti i prodotti",
                "Esci"
        };

        while (true) {
            int scelta = Tools.Menu(opzioniMenu, scanner);
            Tools.clrScr();

            try {
                switch (scelta) {
                    case 1:
                        System.out.print("Inserire codice: ");
                        String codice = scanner.nextLine();
                        System.out.print("Inserire marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Inserire prezzo: ");
                        double prezzo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Inserire modello: ");
                        String modello = scanner.nextLine();
                        System.out.print("Inserire memoria (GB): ");
                        int memoria = Integer.parseInt(scanner.nextLine());

                        negozio.aggiungiProdotto(new Smartphone(codice, marca, prezzo, modello, memoria));
                        System.out.println("Smartphone aggiunto con successo!");
                        break;

                    case 2:
                        System.out.print("Inserire codice del prodotto da rimuovere: ");
                        String codiceRimuovi = scanner.nextLine();
                        negozio.rimuoviProdotto(codiceRimuovi);
                        System.out.println("Prodotto rimosso con successo.");
                        break;

                    case 3:
                        System.out.print("Inserire codice del prodotto da cercare: ");
                        String codiceCerca = scanner.nextLine();
                        ProdottoElettronico prodotto = negozio.cercaProdotto(codiceCerca);
                        System.out.println("Prodotto trovato: " + prodotto);
                        break;

                    case 4:
                        System.out.print("Inserire codice del prodotto da modificare: ");
                        String codiceModifica = scanner.nextLine();
                        System.out.print("Inserire nuovo prezzo: ");
                        double nuovoPrezzo = Double.parseDouble(scanner.nextLine());

                        negozio.modificaPrezzo(codiceModifica, nuovoPrezzo);
                        System.out.println("Prezzo aggiornato con successo!");
                        break;

                    case 5:
                        System.out.println("\nElenco prodotti disponibili:");
                        negozio.getInventario().forEach(System.out::println);
                        break;

                    case 6:
                        System.out.println("Chiusura del programma...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Scelta non valida, riprovare.");
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }

            System.out.println("\nPremi INVIO per continuare...");
            scanner.nextLine();
        }
    }
}