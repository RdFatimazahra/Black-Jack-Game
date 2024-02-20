package BlackJack;


public class Croupier extends Personne {
    private int valeurTotalLimit;

    public Croupier(int valeurTotalLimit) {
        super("Croupier");
        this.valeurTotalLimit = valeurTotalLimit;
    }

    public boolean doitTirer() {
        return getMain().getValeurTotal() < valeurTotalLimit;
    }
}
