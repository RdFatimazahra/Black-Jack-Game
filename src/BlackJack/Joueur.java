package BlackJack;


public class Joueur extends Personne {
    private double solde;

    public Joueur(String username, double solde) {
        super(username);
        this.solde = solde;
    }

    public void placerMise(double mise) {
        solde -= mise;
    }
}
