package com.elorduy.gorka.busquedas;

import java.util.Arrays;

public class BusquedaBinaria {

	static int busquedaBinaria(int[] arreglo, int valorABuscar) {
		int minimo = 0;
		int maximo = arreglo.length - 1;
		int posicionValor = 0;
		int contador = 0;
		
		while(maximo >= minimo) {
			contador = contador + 1;
			posicionValor = (int) Math.floor((maximo + minimo)/2);
			
			if(arreglo[posicionValor] == valorABuscar) {
				System.out.println("El valor está en la posicion: "+posicionValor);
				System.out.println("Número de intentos: "+contador);
				return posicionValor;
			}else if(arreglo[posicionValor] > valorABuscar) {
				maximo = posicionValor - 1;
				
			}else {
				minimo = posicionValor + 1;
			}
			
			
		}
		System.out.println("No se ha podido encontrar el número deseado");
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arregloNumeros = {7,9,0,98,45,5};
		Arrays.sort(arregloNumeros);
		
		busquedaBinaria(arregloNumeros, 562);

	}

}
