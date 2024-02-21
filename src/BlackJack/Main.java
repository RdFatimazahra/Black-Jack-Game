package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Main implements MainInterface {
    private String nom;
    private int valeurTotal;
    private List<Carte> cartes;

    public Main(String nom) {
        this.nom = nom;
        this.valeurTotal = 0;
        this.cartes = new ArrayList<>();
    }

    public void ajouterCarte(Carte carte) {
        cartes.add(carte);
        valeurTotal += carte.getValeur();
    }

    public int getValeurTotal() {
        return valeurTotal;
    }

    public String getNom() {
        return nom;
    }

    public List<Carte> getCartes() {
        return cartes;
    }
}
