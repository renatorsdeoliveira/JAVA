package br.com.Objetos;

public class Lampada {
 
	private String cor;
	private double valor;
	private int wolts;
    private int garantia;
    
    
    
    public Lampada(){
    	
    }
    
    public Lampada(int wolts,int garantia  ){
    	
    	
    	 this.wolts = wolts;
    	 this.garantia =  garantia;
    	 
    }
    public Lampada(String cor ){
    	
   	 this.cor = cor;

   	 
   }
    public Lampada(double valor  ){
    	
   	
   	 this.valor = valor;
   	 
   }
    public String getCor (String cor){
    	return cor;
    }
    
    public double getValor (double valor){
    	return valor;
    }
    
    public int getWolts (double valor){
    	return wolts;
    }
    public int getGarantia (int garantia){
    	return garantia;
    }
    
	
	
}
