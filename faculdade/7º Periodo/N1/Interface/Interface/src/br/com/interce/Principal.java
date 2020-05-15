package br.com.interce;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  FormaGeografica retanculo = new Retanculo(3, 4);
		  FormaGeografica circulo = new Circulo(5);
		  FormaGeografica quadrado = new Quadrado(5);
		  System.out.println();

		  List<FormaGeografica> lista = new ArrayList<FormaGeografica>();
		  lista.add(retanculo);
		  lista.add(circulo);
		  lista.add(quadrado);

		  for (FormaGeografica forma : lista) {

			  System.out.println("Área: " + forma.area());
			  System.out.println("Perímetro: " + forma.perimetro());
			 
		  }

	  }
		
	

}
