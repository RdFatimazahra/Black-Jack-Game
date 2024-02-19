import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PaquetCartes {
    private List<Carte> cartes;

    public PaquetCartes() {
        this.cartes = new ArrayList<>();
        initialiserPaquet();
        melangerCartes();
    }

    // Méthode pour initialiser le paquet de cartes avec 52 cartes
    private void initialiserPaquet() {
        for (int couleur = 1; couleur <= 4; couleur++) {
            for (int valeur = 1; valeur <= 13; valeur++) {
                cartes.add(new Carte(couleur, Math.min(valeur, 10)));
            }
        }
    }

  
