
package br.com.ex_03;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dado d = new Dado(6);
		Dado d1 = new Dado(8);
		
		
		
		int dado1 = 0, dado2 = 0;
		int opcao;
		ArrayList <Pessoa> ListaDePessoas = new ArrayList <Pessoa>();
		ArrayList <Dado> ListaDado = new ArrayList <Dado>();
		ListaDado.add(d1);

			Pessoa ps = new Pessoa(); 	ListaDePessoas.add(ps); 	
			Pessoa pss = new Pessoa();	ListaDePessoas.add(pss);	
			Pessoa ps3 = new Pessoa();  ListaDePessoas.add(ps3);
			Pessoa ps4 = new Pessoa();	ListaDePessoas.add(ps4);
			Pessoa ps5 = new Pessoa();	ListaDePessoas.add(ps5);
			Pessoa ps6 = new Pessoa();	ListaDePessoas.add(ps6);

		
			
						dado1 = ps.jogarDado8Faces();
						dado2 = ps.jogarDado6Faces();
						dado1 = pss.jogarDado6Faces();
						dado2 = pss.jogarDado8Faces();
						dado1 = ps3.jogarDado8Faces();
						dado2 = ps3.jogarDado6Faces();
						dado1 = ps4.jogarDado6Faces();
						dado2 = ps4.jogarDado8Faces();
						dado1 = ps5.jogarDado8Faces();
						dado2 = ps5.jogarDado6Faces();
						dado1 = ps6.jogarDado6Faces();
						dado2 = ps6.jogarDado8Faces();

		
		 Data dt = new Data();
		 JOptionPane.showMessageDialog(null, "ENTRO COM AS INFORMA��ES DO jOGO");
		 dt.setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia do Confronto: ")));
		 dt.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o M�s do Confronto: ")));
		 Endereco ed = new Endereco();
		 JOptionPane.showMessageDialog(null,"CADASTRE O ENDERE�O DO CONFRONTO ");
		 ed.setNomeRua(JOptionPane.showInputDialog("Digite o Nome da Rua: "));
		 ed.setBairro(JOptionPane.showInputDialog("Digite o Nome do Bairro: "));
		 ed.setCidade(JOptionPane.showInputDialog("Digite o nome da Cidade: "));
		 ed.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite CEP: ")));
		 
		 JOptionPane.showMessageDialog(null, "Participantes");
		 ps.setNome(JOptionPane.showInputDialog("Digite o nome do 1� Participante: "));
		 pss.setNome(JOptionPane.showInputDialog("Digite o nome do 2� Partipante: "));
		 JOptionPane.showMessageDialog(null, "PRIMEIRO CONFRONTO\n"+ps.getNome()+" VS "+pss.getNome());
		 
		 ps3.setNome(JOptionPane.showInputDialog("Digite o nome do 3� Participante: "));
		 ps4.setNome(JOptionPane.showInputDialog("Digite o nome do 4� Partipante: "));
		 JOptionPane.showMessageDialog(null, "SEGUNDO CONFRONTO\n"+ps3.getNome()+" VS "+ps4.getNome());
		 
		 ps5.setNome(JOptionPane.showInputDialog("Digite o nome do 5� Participante: "));
		 ps6.setNome(JOptionPane.showInputDialog("Digite o nome do 6� Partipante: "));
		 JOptionPane.showMessageDialog(null, "TERCEIRO CONFRONTO\n"+ps5.getNome()+" VS "+ps6.getNome());
		 JOptionPane.showMessageDialog(null, "REGRAS\n\nCada um ter� dois dados o primeiro de [6] e o  segundo de [8]\n\nBoa Sorte!");
		 
		 JOptionPane.showMessageDialog(null, (ps.getNome()+" Tirou "  + ps.jogarDado6Faces())+" e "+ ps.jogarDado8Faces());
		 JOptionPane.showMessageDialog(null, (pss.getNome()+" Tirou "  + pss.jogarDado6Faces())+" e "+pss.jogarDado8Faces());
		 JOptionPane.showMessageDialog(null, (ps3.getNome()+" Tirou "  + ps3.jogarDado6Faces())+" e "+ps3.jogarDado8Faces());
		 JOptionPane.showMessageDialog(null, (ps4.getNome()+" Tirou "  + ps4.jogarDado6Faces())+" e "+ps4.jogarDado8Faces());
		 JOptionPane.showMessageDialog(null, (ps5.getNome()+" Tirou "  + ps5.jogarDado6Faces())+" e "+ps5.jogarDado8Faces());
		 JOptionPane.showMessageDialog(null, (ps6.getNome()+" Tirou "  + ps6.jogarDado6Faces())+" e "+ps6.jogarDado8Faces());
		
		
	}

}
