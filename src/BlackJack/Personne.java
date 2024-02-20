package BlackJack;

import java.util.ArrayList;
import java.util.List;

	public class Personne {
	    protected String nom;
	    protected Main main;

	    public Personne(String nom) {
	        this.nom = nom;
	        this.main = new Main(nom);
	    }

	    public void ajouterCarte(Carte carte) {
	        main.ajouterCarte(carte);
	    }

	    public Main getMain() {
	        return main;
	    }
	}
