package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double x, y, cal=0;
			int codigo;
			
			x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de [x]: "));
			y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de [y]: "));
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo do calculo desejado: "));
			
			if(codigo == 1){
				cal = Math.sqrt(Math.pow(x, 2) + Math.pow((x *(2*y-x)),2));
			}else if (codigo == 2){
				cal = Math.sqrt((Math.pow(x, 3)+ Math.pow(y, 3))+ (Math.pow(x, 3)- Math.pow(y, 3)) / x*y);				
			}else if (codigo == 3){
				cal = 2* x + Math.sqrt(x*y);
			}else if (codigo == 4){
				cal = Math.sin(x) + Math.cos(y);
			}
			
			JOptionPane.showMessageDialog(null, "O valor do Calcúlo de (f) de x e y é: "+cal);
			
	}

}
