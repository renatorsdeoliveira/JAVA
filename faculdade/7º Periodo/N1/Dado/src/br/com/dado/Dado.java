package br.com.dado;

public class Dado {

	private int qdtLados;

	
	public Dado() {
		
	}

	public Dado(int qdtLados) {
		this.qdtLados = qdtLados;
	}

	public int getQdtLados() {
		return qdtLados;
	}

	public void setQdtLados(int qdtLados) {
		this.qdtLados = qdtLados;
	}
	
	
		

	@Override
	public String toString() {
		return "Dado [qdtLados=" + qdtLados + "]";
	}

	
	
	
	
	
	
}
