package Autos;

public class Auto extends Vehiculo{
	
	private boolean airbag;

	public Auto(String clr, String mar, double kilom, double price, boolean ab) {
		super(clr, mar, kilom, price);
		setAirbag(ab);
	}
	
	public void tocarBocina() {
		System.out.print("*Bocina de Auto*");
	}

	public String isAirbag() {
		if(airbag) return "Si";
		else return "No";
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}
}
