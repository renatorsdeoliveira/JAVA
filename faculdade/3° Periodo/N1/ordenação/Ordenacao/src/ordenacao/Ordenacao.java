package ordenacao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ordenacao {
	String arrlinha[];
	long tempoInicio;
	 
	
	public Ordenacao(String[] arrlinha, long tempoInicio) {
	
	}


	public static String[] selectionSort(String[] arrlinha) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i <= arrlinha.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j <= arrlinha.length - 1; j++) {
				if (arrlinha[j].length() < arrlinha[min].length()) {
					min = j;
				}
			}
			String t = arrlinha[min];
			arrlinha[min] = arrlinha[i];
			arrlinha[i] = t;
		}
		
		return arrlinha;
	}
	public static String[] bubbleSort(String[] A, int n) {
		// TODO Auto-generated method stub
		int i, j;
		String t;
		for(i=n-1; i<=A.length; i--) {
			for(j=1;j<=i;j++) {
				if( A[j-1].length() > A[j].length()) {
					t=A[j-1];
					A[j-1]=A[j];
					A[j]=t;
				}
			}
		}
		return A;
	}	
	public static String[] insertionSort(String[] A, int n) {
		// TODO Auto-generated method stub
		int i,j;
		String v;
		
		for(i=0;i<=n-1;i++) {
			v=A[i];
			j=i;
			
			while((j>0) && (A[j-1].length() >v.length())){
				A[j]=A[j-1];
				j=j-1;
			}
			A[j]=v;
			
		}
		return A;
	}
	 public static String[] mergeSort(String[] A, int p , int r) {

	        if (p < r) {
	       
	            int q = (p + r) / 2;
	            mergeSort(A, p,q);
	            mergeSort(A, q +1 , r);
	            intercala(A, p, q,r);
	        }
	       
	        return A;
	    }
//p inicio do vetor, q meio do vetor , r fim do vetor
	    //se der merda colocar static
	    public static String[] intercala(String[] A, int p, int q, int r) {
	    	int size= A.length;
	    	String[] B = new String [size];
	    	
	    	 int i,j,k;
		
			for ( i=p; i <= q; i++) {
	           
				B[i]=A[i];
			}
			for (j=q+1;j<=r;j++) {
				
				B[r+q+1-j]=A[j];
				
			}
			i=p;
			j=r;
			
		
			for( k=p; k<=r; k++) {
				if (B[i].length()<=B[j].length()){
					A[k]=B[i];
					i=i+1;
				}
				else {
					A[k]=B[j];
					j=j-1;
				}
			}
		return A;
	            }
	    public static String[] quickSort(String[] A, int p, int r) {
			// TODO Auto-generated method stub
			int q;
			if (p<r) {
				q=Particione(A,p,r);
					quickSort(A,p,q-1);
					quickSort(A,q+1,r);
			}
			return A;
		}


		private static int Particione(String[] A, int p, int r) {
			// TODO Auto-generated method stub
			String x = A[r];
			int i = p-1;
			for (int j = p; j<=r-1;j++) {
				if (A[j].length()<=x.length()){
					i=i+1;
					A[i]=A[j];
				}
			}
			A[i+1]=A[r];
			return i+1;
		}

	        

	public static void mostrarVetor(String[] v, long tempoInicio){
		FileWriter arq;
		try {
			arq = new FileWriter("C:/Users/02961507111/Desktop/resultado.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("+--Resultado--+%n");
			System.out.println("\n\nVetor:");
			for (int i = 0; i < v.length; i++) {
				gravarArq.println((v[i] + "\n length: \n"+v[i].length()));
				System.out.println(v[i] + " length: "+v[i].length());
			
			}
			long tempofinal = System.nanoTime();
			long tempos = System.currentTimeMillis();
			gravarArq.println((tempofinal-tempoInicio)+" n/s");
			System.out.println((tempofinal-tempoInicio)+" n/s");
			gravarArq.println(tempos+" m/s");
			System.out.println(tempos+" m/s");

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

	

	


	
}
