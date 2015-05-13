package gestioneostello;

public class Cliente 
{
		private String nome;
		private String cognome;
		private String cellulare;
		
		public Cliente(String nome, String cognome, String cellulare)
		{
			if(this.nome != null)
			{
				this.nome = nome;
			}
			else
			{
				throw new IllegalArgumentException("Numero non può essere null");
			}
			
			if(this.cognome != null)
			{
				this.cognome = cognome;
			}
			else
			{
				throw new IllegalArgumentException("Numero non può essere null");
			}
			
			if(this.cellulare != null)
			{
				this.cellulare = cellulare;
			}
			else
			{
				throw new IllegalArgumentException("Numero non può essere null");
			}
			
		}

		public String getNome()
        {
			return nome;
		}

		public String getCognome() 
		{
			return cognome;
		}

		public String getCellulare()
		{
			return cellulare;
		}

}
