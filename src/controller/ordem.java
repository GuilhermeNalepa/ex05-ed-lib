package controller;

import lib.ordena.ordenarVetores;

public class ordem {

	public ordem() {

		super();
	
	}
	
	public void ordemVetor () {
		
		int[] vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		ordenarVetores ordenarVetores = new ordenarVetores();
		vt = ordenarVetores.bubbleSort(vt);
		vt = ordenarVetores.mergeSort(vt, 0, vt.length - 1);
		
	}

}
