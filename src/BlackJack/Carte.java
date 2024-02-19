package BlackJack;

public class Carte {

	private String valeur;
	private String type;
	
		
	//Getters and Setters :
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Carte(String values, String type) {
	
		this.valeur = values;
		this.type = type;
	}
	
	
	
	
}
