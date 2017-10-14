package br.com.Ex_01;

public class Objeto {

	private int inicio;
	private int fim;
	private int a;
	private int b;
		
	public Objeto (){
		
	}
	
	public Objeto(int inicio, int fim, int a, int b){
		this.inicio = inicio;
		this.fim = fim;
		this.a = a;
		this.b = b;
		
	}
	
	public int getInicio(){
		return inicio;
	}
	public int getFim(){
		return fim;
	}
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public String Hello (){
		return " Bem vindos a Orientação a Objetos. ";
	}
	public String getImpares(){
		String msg ="";
		for(int i = this.inicio; i<this.fim; i++ ){
			if(i%2!=0){
				msg += i + " ";
			}
		}
		
		return msg;
	}
	
	public String inverterString(String str)
	{
		String invertidaStr = "";
		
		for(int i = str.length()-1; i>= 0; i--)
		{
			invertidaStr += str.charAt(i);
		}
		
		return invertidaStr;
		
		
	}
	public int Operacao1(){
		int Operacao1;
		return Operacao1 = (int) Math.pow(inicio, fim);
	
	}
	public int Operacao2(){
		int Operacao2;
		return Operacao2 = (int) Math.pow(a, 2) + 2 * a * b + (int) Math.pow(b, 2);
	}
}
