package BlackJack;

public class Carte {

	    private int couleur;
	    private int valeur;

	    public Carte(int couleur, int valeur) {
	        this.couleur = couleur;
	        this.valeur = valeur;
	    }

	    public int getValeur() {
	        return valeur;
	    }

		@Override
		public String toString() {
			return "Carte [couleur=" + couleur + ", valeur=" + valeur + "]";
		}
	}

	
	

