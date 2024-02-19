package BlackJack;

public class Personne {
	
	
    private String nom;
    private Main main;

    public Personne(String nom) {
        this.nom = nom;
        this.main = new Main(nom);
    }

    // Méthode pour ajouter une carte à la main
    public void ajouterCarte(Carte carte) {
        main.ajouterCarte(carte);
    }

    // Méthode pour obtenir la main
    public Main getMain() {
        return main;
    }
}
