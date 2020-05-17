package br.com.ex_04;

public class ProfPesquisador extends Professor{
	
	int horas_pesquisa;
	
	public ProfPesquisador(){
		
	}
	public ProfPesquisador(String nome, String telefone, String endereco, String cpf, int identidade, int idade,
			double salario, int horas, int horas_pequisa, int horas_pesquisa) {
		super(nome, telefone, endereco, cpf, identidade, idade, salario, horas);
		this.horas_pesquisa = horas_pesquisa;
		// TODO Auto-generated constructor stub
	}
	
	public void setSalario(int horas, int horas_pesquisa){
		double base = 800.0, adicionalHora = 0;
		
		if(horas <= 12)
		{
			adicionalHora = (35 * horas);
		}
		else if(horas > 12 | horas <= 20)
		{
			adicionalHora = (33 * horas);
		}
		else if(horas > 20 | horas <= 40 )
		{
			adicionalHora = (30 * horas);
		}
		
		salario = (base + adicionalHora);
		
		double imposto = 0.0;
		
		if(salario > 1200.0 | salario <= 2500.0)
		{
			imposto = (salario * 5) / 100;
		}
		else if(salario > 2500.0 )
		{
			imposto = (salario * 8) / 100;
		}
		
		salario = salario - imposto;
			
		if(horas_pesquisa <= 12)
		{
			salario = salario + 1000.0;
		}
		else
		{
			salario = salario +1500.0;
		}
	}
	@Override
	public String toString() {
		return "\n\nProfessor Pesquisador:" +"\n\nNome: " +getNome() + 
		"\nTelefone" + getTelefone() + 
		"\nIdentidade: " +getIdentidade() + 
		"\nCPF: " + getCpf() +
		"\nIdade" + getIdade() + 
		"\nSalario: " +getSalario();
	
    }
}
