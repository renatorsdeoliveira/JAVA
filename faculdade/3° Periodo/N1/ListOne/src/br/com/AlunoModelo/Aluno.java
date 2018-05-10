package br.com.AlunoModelo;

	public class Aluno {
		
	 private String nome;
	 private String matricula;
	 private double n1,n2;
	 
	 public Aluno (){
		 
	 }
	 
	 public Aluno (String nome){
		 this.nome = nome;
	 }
	 
	 public Aluno (String nome, String matricula, double n1, double n2){
		 this.nome = nome;
		 this.matricula = matricula;
		 this.n1 = n1;
		 this.n2 = n2;
	 }	
	 
	
	 public String getNome(){
		 return this.nome;
	 }
	 
	 public void setNome(String nome){
		 this.nome = nome;
	 }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double calculaMedia(){
		double media = (n1 +n2)/2;
		return media;
	}
	
	public String toString(){
		return "------- informações do Aluno ------- \n"+
	"\nNome: " + getNome()
	+"\nMatricula: "+ getMatricula()+
	  "\n1° Nota : " + getN1()+
	   "\n2° 	Nota : "+ getN2()+
		"\nMedia: " + calculaMedia()+"\n";
	}
}

