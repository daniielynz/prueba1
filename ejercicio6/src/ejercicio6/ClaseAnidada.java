package ejercicio6;

class ClaseAnidada {
	void entrada() { 
		System.out.println("Método entrada.");
	}

	String salida (int d) {
		System.out.println("Salida.");
		return "Salida el " + d; 
	}
	
	public void verPorConsola () {
		ClaseAnidada ej = new ClaseAnidada();
		ej.entrada(); 
		System.out.println("Llamo a Salida: " + ej.salida(10) ); 
	}
}