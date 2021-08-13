package Autos;

public class Moto extends Vehiculo {

	public Moto(String clr, String mar, double kilom, double price) {
		super(clr, mar, kilom, price);
	}
	
	public void tocarBocina() {
		System.out.print("*Bocina de Moto*");
	}
}
