package br.com.area;

        import javax.swing.JOptionPane;

public class Area {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float raio, area, perimetro, calculo, quatrado;
		
		raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o raio: "));
		area = (float) (Math.PI*(raio * raio ));
		perimetro = (float) (2*Math.PI*raio);
		calculo = area *perimetro;
		
		JOptionPane.showMessageDialog(null,"O Resultado do calculo da Area é: "+calculo);
		
	}

}
