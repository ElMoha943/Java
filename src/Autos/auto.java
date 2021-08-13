package Autos;

public class auto {
	//ATRIBUTOS
	private String Color;
	private String Marca;
	private double Km;
	private double Precio;
	
	public auto(String clr, String mar, double kilom, double price){ //CONSTRUCTOR
		setColor(clr);
		setMarca(mar);
		setKm(kilom);
		Precio=price;
	}
	
	//GETS & SETS
	public void setPrecio(double price) { //SET - SETTERS
		Precio=price;
	}
	
	public double GetPrecio(){ //GETS - GETTERS
		return Precio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getKm() {
		return Km;
	}

	public void setKm(double km) {
		Km = km;
	}
	
	//METODOS
		public void TocarBocina() {
			System.out.print("Bocina");
		}
}

//auto fiat = new auto("rojo","fiat",1000,35000)
//fiat.cambiarPrecio(100);
//System.out.print(fiat.GetPrecio());
//Variable = GetPrecio();