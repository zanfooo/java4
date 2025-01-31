
import backend.Automobile;
import backend.Concessionaria;
import backend.Moto;
import backend.Veicolo;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Veicolo> listaVeicoli = new ArrayList<Veicolo>();

        String[] opzioni = {"----CONCESSIONARIA----", "1 - Create", "2 - Read", "3 - Update", "4 - Delete", "5 - Exit"};
        int scelta;




        Concessionaria concessionaria = new Concessionaria();

        do {
            scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> {
                    Veicolo veicolo = new Veicolo("Lamborghini", "Urus", 250000);
                    concessionaria.aggiungiVeicolo(veicolo, listaVeicoli);
                    Veicolo moto1 = new Moto("KTM", "237Q", 35000, 500);
                    concessionaria.aggiungiVeicolo(moto1, listaVeicoli);
                    Veicolo moto2 = new Moto("KTM", "153Y", 35000, 35000);
                    concessionaria.aggiungiVeicolo(moto2, listaVeicoli);
                    Veicolo moto3 = new Moto("Kawasaki", "777S", 19000, 300);
                    concessionaria.aggiungiVeicolo(moto3, listaVeicoli);
                    Veicolo automobile1 = new Automobile("Maserati", "Ghibli", 95000, 5);
                    concessionaria.aggiungiVeicolo(automobile1, listaVeicoli);
                }
                case 2 -> {
                    concessionaria.visualizzaVeicoli(listaVeicoli);
                }
                case 3 -> {
                    concessionaria.modificaVeicolo(listaVeicoli);
                }
                case 4 -> {
                    System.out.println("Digita la marca del veicolo che vuoi eliminare: ");
                    String vecchiaMarca = tastiera.nextLine();
                    System.out.println("Digita il modello del veicolo che vuoi eliminare: ");
                    String vecchioModello = tastiera.nextLine();
                    concessionaria.eliminaVeicolo(listaVeicoli, vecchiaMarca, vecchioModello);
                }
            }
        }while (scelta != 5);




    }
}
