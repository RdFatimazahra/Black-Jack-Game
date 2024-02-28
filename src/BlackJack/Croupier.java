package BlackJack;


public class Croupier extends Personne implements CroupierInterface {
    private int valeurTotalLimit;

    public Croupier(int valeurTotalLimit) {
        super("Croupier");
        this.valeurTotalLimit = valeurTotalLimit;
    }

    @Override
    public boolean doitTirer() {
        return getMain().getValeurTotal() < valeurTotalLimit;
    }
}
