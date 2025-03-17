package Activiades;

public class Chocolatina {
	private static String marca;
	
	public Chocolatina(String string) {
		// TODO Auto-generated constructor stub
	}
	public static String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Chocolatina[marca=" + marca + "]";
	}
}
