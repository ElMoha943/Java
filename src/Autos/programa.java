package Autos;
import java.util.*;

public class programa {
	public static void main(String[] args) {
		List<auto> autos = new ArrayList<>();
		
		auto fiat = new auto("rojo","fiat",1000,35000);
		auto ford = new auto("rojo","ford",1000,35000);
		auto falcon = new auto("rojo","falcon",1000,35000);
		
		autos.add(fiat);
		autos.add(ford);
		autos.add(falcon);
		
		for(auto a :autos)
			System.out.println(a.getMarca()+": "+a.GetPrecio());
	}
}
