package BlackJack;


public class Joueur extends Personne implements JoueurInterface {
    private double solde;

    public Joueur(String username, double solde) {
        super(username);
        this.solde = solde;
    }
    
    @Override
    public void placerMise(double mise) {
        solde -= mise;
    }
    
    @Override
    public void ajusterSolde(double montant) {
        solde += montant;
    }
    
    @Override
    public double getSolde() {
        return solde;
    }
}
