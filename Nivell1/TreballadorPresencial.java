package Nivell1;

public class TreballadorPresencial extends Treballador {

	private static float benzina;
	
	public TreballadorPresencial(String nom, String cognom, float preu) {
		super(nom, cognom, preu);
		this.benzina = 100;
	}

	public static float getBenzina() {
		return benzina;
	}

	public static void setBenzina(float benzina) {
		TreballadorPresencial.benzina = benzina;
	}
	
	public float calcularPreu(float hora) {
		
		float sou; 
		
		sou = super.calcularPreu(hora) + benzina; // aplicar el plus de la benzina 
				 
		return sou; 		
	}
	
	@Deprecated
	public void ferFeina(String projecte){
		
		System.out.println("El treballador presencial està treballant el projecte " + projecte);
	}
	

	@Override
	public String toString() {
		return "El treballador presencial es diu " + super.getNom() + super.getCognom() + " i té un preu/hora de: "+ super.getPreu();
	}
	
	

}
