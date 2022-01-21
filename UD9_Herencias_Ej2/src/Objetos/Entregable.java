package Objetos;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public interface Entregable {
	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public boolean compareTo(Object object);
}
