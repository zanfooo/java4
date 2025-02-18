public class Gara {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Dado dado;
    private int roundTotali;
    private int roundCorrente;
    private boolean garaInCorso;
    private double winrate;

    public Gara(Giocatore giocatore1, Giocatore giocatore2, int roundTotali, Dado dado) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
        this.dado = dado;
        this.roundTotali = roundTotali;
        this.roundCorrente = 0;
        this.garaInCorso = true;
    }

    public Giocatore getGiocatore1() {
        return giocatore1;
    }

    public Giocatore getGiocatore2() {
        return giocatore2;
    }

    public Dado getDado() {
        return dado;
    }

    public int getRoundTotali() {
        return roundTotali;
    }

    public int getRoundCorrente() {
        return roundCorrente;
    }

    public boolean isGaraInCorso() {
        return garaInCorso;
    }

    public String getWinner() {
        if (roundCorrente < roundTotali) {
            return "Partita in corso";
        } else {
            if (giocatore1.getVittorie() > giocatore2.getVittorie()) {
                return giocatore1.getNome();
            } else if (giocatore2.getVittorie() > giocatore1.getVittorie()) {
                return giocatore2.getNome();
            } else {
                return "Parità";
            }
        }
    }

    public void round() {
        if (roundCorrente < roundTotali) {
            // Ogni giocatore lancia il dado
            int lancioGiocatore1 = dado.lancia();
            int lancioGiocatore2 = dado.lancia();
            System.out.println(giocatore1.getNome() + " lancia: " + lancioGiocatore1);
            System.out.println(giocatore2.getNome() + " lancia: " + lancioGiocatore2);

            // Determiniamo il vincitore del round
            if (lancioGiocatore1 > lancioGiocatore2) {
                System.out.println(giocatore1.getNome() + " vince questo round.");
                System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore1));
                giocatore1.incrementaVittorie();
            } else if (lancioGiocatore2 > lancioGiocatore1) {
                System.out.println(giocatore2.getNome() + " vince questo round.");
                System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore2));
                giocatore2.incrementaVittorie();
            } else {
                System.out.println("Parità in questo round.");
                giocatore1.incrementaVittorie();
                giocatore2.incrementaVittorie();
            }

            roundCorrente++;
            if (roundCorrente == roundTotali) {
            garaInCorso = false;
            }
        }
    }

    public void gameWin() {
        if (giocatore1.getVittorie() > giocatore2.getVittorie()) {
            System.out.println(giocatore1.getNome() + " ha vinto la gara!");
            System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore1));
        } else if (giocatore2.getVittorie() > giocatore1.getVittorie()) {
            System.out.println(giocatore2.getNome() + " ha vinto la gara!");
            System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore2));
        } else {
            System.out.println("La gara è finita in parità");
            System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore1));
            System.out.println("Winrate del giocatore: " + setWinrateCorrente(giocatore2));
        }
    }

    public double setWinrateCorrente(Giocatore g) {
        winrate = (double) g.getVittorie() / roundCorrente;
        return winrate * 100;
    }

    public void resetGame() {
        roundCorrente = 0;
        giocatore1.resetVittorie();
        giocatore2.resetVittorie();
        garaInCorso = true;
    }
}
