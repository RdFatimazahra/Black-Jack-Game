package BlackJack;


public class Croupier extends Personne {
	
    private int valeurTotalLimit; // Limite de valeur totale avant que le croupier ne tire plus de cartes

    public Croupier(int valeurTotalLimit) {
        super("Croupier");
        this.valeurTotalLimit = valeurTotalLimit;
    }

    // Méthode pour vérifier si le croupier doit tirer une nouvelle carte
    public boolean doitTirer() {
        return getMain().getValeurTotal() < valeurTotalLimit;
    }
}

