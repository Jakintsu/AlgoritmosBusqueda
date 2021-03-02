package com.elorduy.gorka.busquedas;

public class OrdenamientoSeleccion {

	static void intercambioPosiciones(int[] arreglo, int posicionInicio, int posicionFin) {
		int temp = arreglo[posicionInicio];
		arreglo[posicionInicio] = arreglo[posicionFin];
		arreglo[posicionFin] = temp;
	}

	static int obtenerIndiceMinimo(int[] arreglo, int posicionInicio) {
		int valorMinimo = arreglo[posicionInicio];
		int posicionMinimo = posicionInicio;

		for (int i = posicionInicio + 1; i < arreglo.length; i++) {
			if (arreglo[i] < valorMinimo) {
				valorMinimo = arreglo[i];
				posicionMinimo = i;
			}
		}

		return posicionMinimo;
	}

	static void ordenamientoSeleccion(int[] arreglo) {
		int hallarMinimo = 0;
		for (int i = 0; i < arreglo.length; i++) {
			hallarMinimo = obtenerIndiceMinimo(arreglo, i);
			intercambioPosiciones(arreglo, i, hallarMinimo);
		}
	}

	public static void main(String[] args) {

		int[] arregloPrueba = { 22, 11, 99, 88, 9, 7, 42, -852, 9600 };
		ordenamientoSeleccion(arregloPrueba);
		
		System.out.println("Tras el ordenamiento:");
		for(int i = 0; i < arregloPrueba.length; i++) {
			System.out.print(arregloPrueba[i] + " ");
		}

	}

}
