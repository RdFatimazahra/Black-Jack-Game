import java.util.ArrayList;
import java.util.List;

public class Main {
    private String nom; // Nom du joueur ou du croupier
    private int valeurTotal; // Valeur totale des cartes dans la main
    private List<Carte> cartes; // Liste des cartes dans la main

    public Main(String nom) {
        this.nom = nom;
        this.valeurTotal = 0;
        this.cartes = new ArrayList<>();
    }

    // Méthode pour ajouter une carte à la main
    public void ajouterCarte(Carte carte) {
        cartes.add(carte);
        valeurTotal += carte.getValeur();
    }

    // Méthode pour obtenir la valeur totale de la main
    public int getValeurTotal() {
        return valeurTotal;
    }

    // Méthode pour obtenir le nom de la main
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir les cartes dans la main
    public List<Carte> getCartes() {
        return cartes;
    }
}
