package br.com.ex_04;



    public class Professor extends Pessoa {
	
        protected double salario;
        private int horas;

        public Professor(){
            
        }
        public Professor(String nome, String telefone, String endereco, String cpf, int identidade, int idade, double salario, int horas) {
            super(nome, telefone, endereco, cpf, identidade, idade);
            this.salario = salario;
            this.horas = horas;
        
        }
    
        public double getSalario() {
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
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
            
        }
    
        public int getHoras() {
            return horas;
        }
    
        public void setHoras(int horas) {
            this.horas = horas;
            
        }
        
        @Override
        public String toString() {
            return "\n\nProfessor" + "\n\nNome: " +getNome() + 
            "\nTelefone" + getTelefone() + 
            "\nIdentidade: " +getIdentidade() + 
            "\nCPF: " + getCpf() +
            "\nIdade" + getIdade() + 
            "\nSalario: " +getSalario();
        }
    }
    
    
