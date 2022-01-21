package Objetos;

/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class Serie implements Entregable {

	private String titulo, creador, genero;
	private int numTemporadas;
	private boolean entregado;

	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.numTemporadas = 3;
		this.entregado = false;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.numTemporadas = 3;
		this.entregado = false;
	}

	public Serie(String titulo, String creador, String genero, int numTemporadas) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
	}

	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public boolean compareTo(Object object) {
		if (this.numTemporadas > ((Serie) object).getNumTemporadas()) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", creador=" + creador + ", genero=" + genero + ", numTemporadas="
				+ numTemporadas + ", entregado=" + entregado + "]";
	}
}
