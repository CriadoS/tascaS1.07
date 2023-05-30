package Nivell1;

public class Treballador {
	
	private String nom;
	private String cognom;
	private float preuHora; 
	
	public Treballador(String nom, String cognom, float preu) {
	
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preu;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public float getPreu() {
		return preuHora;
	}

	public void setPreu(float preu) {
		this.preuHora = preu;
	}
	
	public float calcularPreu(float hora) {
		
		float sou; 
		
		sou = preuHora * hora;  
				
		return sou; 
				
	}
	
	

	@Override
	public String toString() {
		return "El treballador es diu: "+ this.nom  +" "+ this.cognom + " i té un preu/hora de " + preuHora + " d'euros.";
	} 
	
	
	
	
	

}
