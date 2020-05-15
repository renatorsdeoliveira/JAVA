package br.com.heranca;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa luizMario = new Pessoa("Luiz", 50, "Masculino");
		JOptionPane.showMessageDialog(null, luizMario.toString());
		
		
		Cliente jorge = new Cliente( 500, 1980);
		jorge.setNome("Jorge");
		jorge.setIdade(35);
		jorge.setSexo("Masculino");
		JOptionPane.showMessageDialog(null, jorge.toString());
		
		
		Empregado programador = new Empregado(2500, "250");
		programador.setNome("Jessica");
		programador.setSexo("Feminina");
		programador.setIdade(25);
		JOptionPane.showMessageDialog(null, programador.toString());
		
		
		Gerente naman = new Gerente("Carlos");
		naman.setNome("Namam");
		naman.setSexo("Masculino");
		naman.setIdade(35);
		naman.setSalario(2500);
		JOptionPane.showMessageDialog(null, naman.toString());
		
		Vendedor ruti = new Vendedor(3000, 50);
		ruti.setNome("Ruti");
		ruti.setSalario(2500);
		JOptionPane.showMessageDialog(null, ruti.toString());
		
		
	}

}
