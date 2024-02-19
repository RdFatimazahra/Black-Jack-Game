package BlackJack;


public class Joueur extends Personne {
	
    private double solde; // Solde du joueur

    public Joueur(String username, double solde) {
        super(username);
        this.solde = solde;
    }

    // Méthode pour placer une mise
    public void placerMise(double mise) {
        solde -= mise;
    }
}
