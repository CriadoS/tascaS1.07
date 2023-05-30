package Nivell1;

public class MainTreballador {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		//Crear 3 tipus de treballadors i crida als mètodes calcularPreu que està override 
		
		Treballador treballador1 = new Treballador("Sílvia", "Criado" , 12.5f);
		
		System.out.println(treballador1.toString()); 
		
		System.out.println("El sou del treballador "+ treballador1.getNom() + "és de " + treballador1.calcularPreu(40)+ " euros."); 
		
		TreballadorPresencial treballador2 = new TreballadorPresencial ("Lluís ", " Mata", 12.5f); 
		
		System.out.println(treballador2.toString()); 
		
		System.out.println("El sou del treballador "+ treballador2.getNom()+" és de " + treballador2.calcularPreu(40) + " euros.");
		
		TreballadorOnline treballador3 = new TreballadorOnline ("Pep", "Cuado", 12.5f); 
		
		System.out.println(treballador3.toString()); 
		
		System.out.println("El sou del treballador "+ treballador3.getNom()+" és de " + treballador3.calcularPreu(40) + " euros.");
		
		
		// part de l'exercici 2 
		treballador2.ferFeina("Annotations");
		treballador3.ferFeina("Collections");
		

	}

}
