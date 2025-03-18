package Activiades;

public class Principal {
	public static void main(String[] args) {
		Bolsa <Chocolatina> bolsaCho = new Bolsa <>(3);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("ferrero");
		bolsaCho.add(c);
		bolsaCho.add(c1);
		bolsaCho.add(c2);
		
		System.out.println("Contenido de la bolsa de chocolatinas:");
		for(Chocolatina chocolatina : bolsaCho) {
			System.out.println(chocolatina);
		}
		
		Bolsa<Golosina> bolsaGolosinas = new Bolsa<>(2);
		Golosina g1 = new Golosina("Caramelo", 10.5);
		Golosina g2 = new Golosina("Gomita", 5.3);
		
		bolsaGolosinas.add(g1);
		bolsaGolosinas.add(g2);
		
		System.out.println("\nContenido de la bolsa de gosolinas: ");
		for (Golosina golosina : bolsaGolosinas) {
			System.out.println(golosina);
		}
	}
}
