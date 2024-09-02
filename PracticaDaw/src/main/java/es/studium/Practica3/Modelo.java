package es.studium.Practica3;

import java.util.ArrayList;

public class Modelo {
	
	Modelo() {
	}

	private boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	  ArrayList<String> verificarPrimos(ArrayList<Integer> original) {
	        ArrayList<String> resultado = new ArrayList<>();
	        for (Integer numero : original) {
	            if (esPrimo(numero)) {
	                resultado.add("Sí"); // es primo
	            } else {
	                resultado.add("No"); // no es primo
	            }
	        }
	        return resultado;
	}

}
