package com.filorock.app.pagnav;

public class pagItem {

	private int numero;
	private boolean actual;

	public pagItem(int numero, boolean actual) {
		this.numero = numero;
		this.actual = actual;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isActual() {
		return actual;
	}

}
