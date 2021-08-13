package Autos;
import java.util.*;

public class programa {
	
	//Variables
	static List<Vehiculo> autos = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	//Main
	public static void main(String[] args) {
		//variables
		int opt=5;
		int i;
		
		//datos de testeo
		autos.add(new Auto("Rojo","Fiat",1000,35000,true));
		autos.add(new Auto("Blanco","Ford",10000,36000,false));
		autos.add(new Auto("Negro","Peugeot",2000,30000,true));
		autos.add(new Auto("Rojo","Chevrolet",1000,50000,true));
		autos.add(new Auto("Azul","Audi",0,150000,true));
		autos.add(new Moto("Verde","Yamaha",0,75000));
		autos.add(new Moto("Negro","Honda",0,25000));
		
		//while(1)
		do {
			System.out.println("MENU PRINCIPAL\n1. Mostrar Vehiculos\n2. Añadir Vehiculo\n3. Quitar Vehiculo\n4. Vaciar Vehiculos\n0. Salir");
			do {
				try {
					opt =  Integer.parseInt(input.nextLine());
				}
				catch(Exception e){
					//Except
				}
			}while(opt<0 || opt > 4);
			switch(opt) {
				case 1:
					mostrarVehiculos();
					break;
				case 2:
					añadirVehiculo();
					break;
				case 3:
					System.out.println("Ingrese el numero de vehiculo a remover: ");
					do {
						i = Integer.parseInt(input.nextLine());
					}while(i >= autos.size());
					autos.remove(i);
					break;
				case 4:
					autos.clear();
			}
		}while(opt!=0); //Condicion de salida
	}
	
	//FUNCIONES
	static void mostrarVehiculos() {
		for(Vehiculo a :autos)
			System.out.println(a.getMarca()+" "+a.getColor()+": $"+a.GetPrecio()+" ("+a.getKm()+"km)");
	}
	
	static void añadirVehiculo() {
		//VARIABLES
		String clr, mar;
		double kilom, price;
		boolean ab;
		int opt;
		
		//INGRESO DE DATOS
		System.out.println("INGRESO DE DATOS DEL VEHICULO");
		System.out.println("Ingrese la Marca: ");
		mar = input.nextLine();
		
		System.out.println("Ingrese el Color: ");
		clr = input.nextLine();
		
		System.out.println("Ingrese el Kilometraje: ");
		kilom = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el Precio: ");
		price = Double.parseDouble(input.nextLine());
		
		System.out.println("¿Desea airbag? 1 Si - 0 No\n");
		do {
			opt = Integer.parseInt(input.nextLine());
			if(opt==1) {
				ab = true;
			}
			else {
				ab = false;
			}
		}while(opt!=1 && opt!= 0);
		
		//Guardado del objeto en la lista
		autos.add(new Auto(clr, mar, kilom, price, ab));
	}
}
