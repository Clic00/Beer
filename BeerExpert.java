package br.com.example.model;

import java.util.*;


/***
 * @author Levyzão
 * 
 *CAMADA DE  MODELO
 *
 */
public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if(color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else if(color.equals("brown")){
			brands.add("None Licor");
			brands.add("Coffee Licor");
		}
		else if(color.equals("dark")) {
			brands.add("Black Beer");
			brands.add("Malzbier");			
		}
		else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
	return(brands);
	}

}

