public class Giocatore {
    private String nome;
    private int vittorie;
    private int bonus;
    private int vittorieConsecutive;
//    private double winrate;


    public Giocatore(String nome) {
        this.nome = nome;
        this.vittorie = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void incrementaVittorie() {
        this.vittorie++;
    }

    public void resetVittorie() {
        this.vittorie = 0;
    }
    public void incrementaConsecutive(){
        this.vittorieConsecutive++;
    }
    public void azzeraConsecutive(){
        this.vittorieConsecutive = 0;
    }


}
