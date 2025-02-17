public class Gara {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Dado dado;
    private int roundTotali;
    private int roundCorrente;
    private boolean garaInCorso;

    public Gara(Giocatore giocatore1, Giocatore giocatore2, int roundTotali, Dado dado) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
        this.dado = dado;
        this.roundTotali = roundTotali;
        this.roundCorrente = 0;
        this.garaInCorso = true;
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
                giocatore1.incrementaVittorie();
            } else if (lancioGiocatore2 > lancioGiocatore1) {
                System.out.println(giocatore2.getNome() + " vince questo round.");
                giocatore2.incrementaVittorie();
            } else {
                System.out.println("Parità in questo round.");
                giocatore1.incrementaVittorie();
                giocatore2.incrementaVittorie();
            }

            roundCorrente++;
            if (roundCorrente == roundTotali) {
                garaInCorso = false;
                gameWin();
            }
        }
    }

    private void gameWin() {
        if (giocatore1.getVittorie() > giocatore2.getVittorie()) {
            System.out.println(giocatore1.getNome() + " ha vinto la gara!");
        } else if (giocatore2.getVittorie() > giocatore1.getVittorie()) {
            System.out.println(giocatore2.getNome() + " ha vinto la gara!");
        } else {
            System.out.println("La gara è finita in parità.");
        }
    }

    public void resetGame() {
        roundCorrente = 0;
        giocatore1.resetVittorie();
        giocatore2.resetVittorie();
        garaInCorso = true;
    }
}
