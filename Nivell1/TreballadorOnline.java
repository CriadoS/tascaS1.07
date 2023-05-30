package Nivell1;

public class TreballadorOnline extends Treballador {

	
	private final float INTERNET;
	
	public TreballadorOnline(String nom, String cognom, float preu) {
		super(nom, cognom, preu);
		this.INTERNET = 50f;
		
	}

	public float getInternet() {
		return INTERNET;
	}

	
	public float calcularPreu(float hora) {
		
		float sou; 
		
		sou = super.calcularPreu(hora) + INTERNET; // aplicar el plus d'internet
			 
		return sou; 
		
	}
	
	@Deprecated
	public void ferFeina(String projecte){
		
		System.out.println("El treballador online està treballant el projecte " + projecte);
	}
	

		
	@Override
	public String toString() {
		return "El treballador online es diu: "+ super.getNom() +" "+ super.getCognom() + " i té un preu/hora "+ super.getPreu() ;
	}
	
	
	

}
