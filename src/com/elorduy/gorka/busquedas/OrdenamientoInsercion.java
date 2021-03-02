package com.elorduy.gorka.busquedas;

public class OrdenamientoInsercion {

	static  void insercion(int[] arreglo, int indiceDerecha, int valor) {
		int i = 0;
		for (i = indiceDerecha; i >= 0 && arreglo[i] > valor; i--) {
			arreglo[i + 1] = arreglo[i];
		}

		arreglo[i + 1] = valor;
	}

	static void realizarInsercion(int[] arreglo) {
		for (int i = 1; i < arreglo.length; i++) {
			insercion(arreglo, i - 1, arreglo[i]);
		}
	}

	public static void main(String[] args) {
		int[] arregloPrueba = { 22, 11, 99, -88, 9, 7, -42 };
		realizarInsercion(arregloPrueba);

		for (int i = 0; i < arregloPrueba.length; i++) {
			if(i != arregloPrueba.length - 1)
			System.out.print(arregloPrueba[i] + ", ");
			else {
				System.out.print(arregloPrueba[i]);
			}
		}

	}
}
