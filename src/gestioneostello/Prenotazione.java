package gestioneostello;

import java.time.*;

public class Prenotazione 
{
	private LocalDateTime dal;
	private LocalDateTime al;
	private Cliente cliente;
	private Camera camera;
	
	public Prenotazione(LocalDateTime dal, LocalDateTime al)
	{
		super();
		this.dal = dal;
		this.al = al;
	}

	public LocalDateTime getDal() 
	{
		return dal;
	}

	public LocalDateTime getAl() 
	{
		return al;
	}

	public Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		if(cliente == null)
			throw new IllegalArgumentException("Cliente non può essere null");
		this.cliente = cliente;
	}

	public Camera getCamera()
	{
		return camera;
	}

	public void setCamera(Camera camera) 
	{
		if(camera == null)
			throw new IllegalArgumentException("Camera non può essere null");
		this.camera = camera;
	}

}
