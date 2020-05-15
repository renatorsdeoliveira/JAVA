package br.com.ex_03;

public class Endereco {

		private String nomeRua;
		private int numeroRua;
		private String cidade;
		private String estado;
		private int cep;
		private String bairro;
		
		public Endereco(String nomeRua, int numeroRua, String cidade, String estado, int cep, String bairro) 
		{
			super();
			this.nomeRua = nomeRua;
			this.numeroRua = numeroRua;
			this.cidade = cidade;
			this.estado = estado;
			this.cep = cep;
			this.bairro = bairro;
		}
		
		public Endereco()
		{
			
		}

		public String getNomeRua() 
		{
			return nomeRua;
		}

		public void setNomeRua(String nomeRua) 
		{
			this.nomeRua = nomeRua;
		}

		public int getnumeroRua() 
		{
			return numeroRua;
		}

		public void setnRua(int numeroRua) 
		{
			this.numeroRua = numeroRua;
		}

		public String getCidade() 
		{
			return cidade;
		}

		public void setCidade(String cidade) 
		{
			this.cidade = cidade;
		}

		public String getEstado() 
		{
			return estado;
		}

		public void setEstado(String estado) 
		{
			this.estado = estado;
		}

		public int getCep() 
		{
			return cep;
		}

		public void setCep(int cep) 
		{
			this.cep = cep;
		}

		public String getBairro() 
		{
			return bairro;
		}

		public void setBairro(String bairro) 
		{
			this.bairro = bairro;
		}

		@Override
		public String toString() {
			return "Endereco [nomeRua=" + nomeRua + ", numeroRua=" + numeroRua + ", cidade=" + cidade + ", estado=" + estado
					+ ", cep=" + cep + ", bairro=" + bairro + "]";
		}
		
		
	}
	
