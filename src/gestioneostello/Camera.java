package gestioneostello;

import java.time.*;
import java.util.Vector;

public class Camera 
{
		private String numero;
		private int capienza;
		private Vector<Prenotazione> prenotazioni;
		
		public Camera(String numero, int capienza) 
		{
			if(this.numero != null)
			{
				this.numero = numero;
			}
			else
			{
				throw new IllegalArgumentException("Numero non può essere null");
			}
			if(this.capienza >0)
			{
				this.capienza = capienza;
			}
			else
			{
				throw new IllegalArgumentException("La capienza deve essere maggiore di 0");
			}
		}

		public String getNumero()
		{
			return numero;
		}
		

		public void setNumero(String numero) 
		{
			if(numero.length() <= 0)
				throw new IllegalArgumentException("Il numero deve avere lunghezza positiva");
			
			this.numero = numero;
		}

		public int getCapienza() 
		{
			return capienza;
		}
		
		public boolean isDisponibile(LocalDateTime dal, LocalDateTime al)
		{
			boolean libera = true;
			
			if(!dal.isAfter(p.getAl()) && !al.isBefore(p.getDal()))
			{
				libera=false;
			}
			
			
			return libera;
		}
		
		public void addPrenotazione(Prenotazione p)
		{
			if(p == null)
				
				throw new IllegalArgumentException("Prenotazione non può essere null");
			
			if(!this.isDisponibile(p.getDal(), p.getAl()))
				
				throw new IllegalArgumentException("Posti non disponibili");
			
			p.setCamera(this);
			
		}

		public Vector<Prenotazione> getPrenotazioni()
		{
			return prenotazioni;
		}
		
		
}
