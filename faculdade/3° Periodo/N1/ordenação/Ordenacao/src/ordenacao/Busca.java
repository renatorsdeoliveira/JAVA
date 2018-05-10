package ordenacao;

public class Busca {
	
	static int i=0;
	public static void sequencial(String[] A, String v) {
		// TODO Auto-generated method stub
		int i=0;
		for (String string : A) {
			if((string).equals(v)) {
				System.out.print("achou");
				
				break;
			}
			i++;
		}
		System.out.println(" posição: "+i);
	}

	public static void binaria(String[] A, String x,int inicio, int fim, int meio) {
		// TODO Auto-generated method stub
		int in=0;
		System.out.println("meio= "+A[meio].length());
		if (x.length()<A[meio].length()) {
			i++;
			
			fim=meio;
			binaria(A,x,inicio, fim,fim/2);
			
		}
		
		else if (x.length()>A[meio].length()) {
	
			i++;

			inicio=meio;
			binaria(A,x,inicio, fim, meio+((fim-inicio)/2));
			
		}
		else if(x.length()==A[meio].length()) { 
			i++;
			System.out.println("achou " +A[meio]+ " " + A[meio].length()+" "+ i );
			 in=meio;
			 int inc=meio;
			while( A[meio].length()-1<A[in].length()) {
				in--;
			if(A[in].equals(x)) {
				System.out.println("Posição "+in+ " "+A[in]);
				break;
			}
			}
			while( A[meio].length()+1>A[inc].length()) {
				inc++;
				if(A[inc].equals(x)) {
				System.out.println("Posição "+inc+ " "+A[inc]);
				break;
				}
			}
			
		}
		
	}

}
