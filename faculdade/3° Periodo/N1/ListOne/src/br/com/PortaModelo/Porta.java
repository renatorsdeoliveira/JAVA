package br.com.PortaModelo;

public class Porta {
	private String aberta, cor;
	private double dimensaoX, dimensaoY, dimensaoZ;

	public Porta() {

	}

	public Porta(String aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		super();
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	public String getAberta() {
		return aberta;
	}

	public void setAberta(String aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	
	@Override
	public String toString() {
		return "Porta: " + aberta + 
				"\nCor: " + cor + 
				"\nCumprimento: " + dimensaoX + 
				" - Metros\nLargura Y: " + dimensaoY
				+ " - Metros\nEspesura Z: " + dimensaoZ+" - Centimetros";
	}

}
