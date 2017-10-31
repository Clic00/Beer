package br.com.example.teste;

import br.com.example.model.BeerExpert;

public class BeerExpertTest {
	public static void main(String[] args) {
		
		BeerExpert be = new BeerExpert();
		
		
		for(String b : be.getBrands("light")) {
			System.out.println(b);
		}
	}
}
