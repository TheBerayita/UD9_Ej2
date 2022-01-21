package Objetos;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class Videojuego implements Entregable {
	
	private String titulo, genero, compania;
	private int horasEstimadas;
	private boolean entregado;
	//Constructores
	public Videojuego() 
	{
		this.titulo = "";
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = 10;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) 
	{
		this.titulo = titulo;
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, String genero, String compania, int horasEstimadas) 
	{
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	//Metodo para booleans
	@Override
	public void entregar() 
	{
		entregado = true;
	}

	@Override
	public void devolver() 
	{
		entregado = false;
	}

	@Override
	public boolean isEntregado() 
	{
		return entregado;
	}

	@Override
	public boolean compareTo(Object object) 
	{
		if(this.horasEstimadas > ((Videojuego)object).getHorasEstimadas())
		{
			return true;
		}
		return false;
	}
	//To string para imprimirlo por pantalla
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compania=" + compania + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + "]";
	}
}
