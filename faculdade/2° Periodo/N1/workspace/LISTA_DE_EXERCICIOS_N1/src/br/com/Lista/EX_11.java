/*Crie um programa para determinar se um número inteiro A é divisível por outro número B. 
 * Os valores devem ser fornecidos pelo usuário. */
 
package br.com.Lista;

		import javax.swing.JOptionPane;
		
public class EX_11 {
	
public static void main(String[] args) {
		
		int A, B, cal;
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Numero A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Numero B: "));
		
		cal = (A % B );
		if(cal == 0 ){
			JOptionPane.showMessageDialog(null, "O numero "+A+" e divisivel por "+B);
		}else{
			JOptionPane.showMessageDialog(null, "O Não e divisivel numero e divisivel!");
		}
	}


}
