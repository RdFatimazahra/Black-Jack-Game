package BlackJack;

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

 // Méthode pour mélanger les cartes dans le paquet
    private void melangerCartes() {
        Random random = new Random();
        for (int i = cartes.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Carte temp = cartes.get(i);
            cartes.set(i, cartes.get(j));
            cartes.set(j, temp);
        }
    }

    // Méthode pour tirer une carte du paquet
    public Carte tirerCarte() {
        if (cartes.isEmpty()) {
            throw new IllegalStateException("Le paquet de cartes est vide");
        }
        return cartes.remove(0);
    }
}

