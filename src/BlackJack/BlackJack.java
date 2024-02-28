package BlackJack;

import java.util.Scanner;

	public class BlackJack {
	    private PaquetCartes paquetCartes;
	    private Joueur joueur;
	    private Croupier croupier;
	    private boolean tourJoueur;

	    public BlackJack(String username, double solde) {
	        this.paquetCartes = new PaquetCartes();
	        this.joueur = new Joueur(username, solde);
	        this.croupier = new Croupier(17); // Valeur totale limite pour le croupier
	        this.tourJoueur = true;
	    }

	    public void jouer() {
	        distribuerCartesInitiales();
	        afficherMains();
	        while (tourJoueur) {
	            menuJoueur();
	            afficherMains();
	        }
	        tourCroupier();
	        afficherMains();
	        determinerResultat();
	    }

	    private void distribuerCartesInitiales() {
	        joueur.ajouterCarte(paquetCartes.tirerCarte());
	        joueur.ajouterCarte(paquetCartes.tirerCarte());
	        croupier.ajouterCarte(paquetCartes.tirerCarte());
	        croupier.ajouterCarte(paquetCartes.tirerCarte());
	    }

	    private void menuJoueur() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\nMenu de jeu");
	        System.out.println("1. Hit (Tirer une nouvelle carte)");
	        System.out.println("2. Stand (Rester avec la main actuelle)");
	        System.out.print("Choix : ");
	        int choix = scanner.nextInt();

	        switch (choix) {
	            case 1:
	                joueurTireCarte();
	                break;
	            case 2:
	                tourJoueur = false;
	                break;
	            default:
	                System.out.println("Choix invalide");
	        }
	    }

	    private void joueurTireCarte() {
	        joueur.ajouterCarte(paquetCartes.tirerCarte());
	    }

	    private void tourCroupier() {
	        while (croupier.doitTirer()) {
	            croupierTireCarte();
	        }
	    }

	    private void croupierTireCarte() {
	        croupier.ajouterCarte(paquetCartes.tirerCarte());
	    }

	    private void afficherMains() {
	        System.out.println("Main du joueur : " + joueur.getMain().getCartes());
	        System.out.println("Main du croupier : " + (tourJoueur ? croupier.getMain().getCartes().subList(1, croupier.getMain().getCartes().size()) : croupier.getMain().getCartes()));
	    }

	    private void determinerResultat() {
	        int valeurJoueur = joueur.getMain().getValeurTotal();
	        int valeurCroupier = croupier.getMain().getValeurTotal();
	        
	        System.out.println("Valeur de la main du joueur : " + valeurJoueur);
	        System.out.println("Valeur de la main du croupier : " + valeurCroupier);

	        if (valeurJoueur > 21) {
	            System.out.println("Le joueur a dépassé 21. Le croupier gagne.");
	            joueur.ajusterSolde(-1); // Retirer la mise
	        } else if (valeurCroupier > 21 || valeurJoueur > valeurCroupier) {
	            System.out.println("Le joueur gagne.");
	            joueur.ajusterSolde(1); // Ajouter la mise
	        } else if (valeurJoueur < valeurCroupier) {
	            System.out.println("Le croupier gagne.");
	            joueur.ajusterSolde(-1); // Retirer la mise
	        } else {
	            System.out.println("Égalité.");
	        }
	        System.out.println("Solde final des jetons : " + joueur.getSolde());
	    }

	  
	    
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez votre nom : ");
	        String nomJoueur = scanner.nextLine();
	        System.out.print("Entrez votre solde initial : ");
	        double soldeInitial = scanner.nextDouble();
	        
	        BlackJack jeu = new BlackJack(nomJoueur, soldeInitial);
	        jeu.jouer();
	    }
	}
	
	
	
	
	
	

