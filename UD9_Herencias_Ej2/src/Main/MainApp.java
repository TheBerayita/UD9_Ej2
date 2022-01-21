package Main;

import Objetos.Serie;
import Objetos.Videojuego;

/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class MainApp {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		
		series[0] = new Serie();
		series[1] = new Serie("Arcane", "League of Legends");
		series[2] = new Serie("Cobra Kai", "Accion", "Jon Hurwitz", 4);
		series[3] = new Serie("The Office", "Greg Daniels", "Comedia", 9);
		series[4] = new Serie("Friends", "Marta Kauffman y David Crane", "Comedia", 10);
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("Dota 2", 1);
		videojuegos[2] = new Videojuego("League of Legends", "MOBA","Riot Games", 1);
		videojuegos[3] = new Videojuego("Destiny", "Shooter", "Bungie", 600);
		videojuegos[4] = new Videojuego("Black Ops 2", "Shooter", "Activision", 15);
		
		series[1].entregar();
		series[3].entregar();
		videojuegos[2].entregar();
		videojuegos[4].entregar();
		
		//Recorrer los array para contar cuantos hay entregados
		
		int contS = 0;
		int contV = 0;
		for (Serie serie : series){
			if (serie.isEntregado()){
				contS++;
				serie.devolver();
			}
		}
		
		for (Videojuego videojuego : videojuegos){
			if (videojuego.isEntregado()){
				contV++;
				videojuego.devolver();
			}
		}
		
		System.out.println("Hay " + contS + " series entregadas");
		System.out.println("Hay " + contV + " videojuegos entregados");
		
		int serieMasTemporadas = 0;
		int videojuegoMasHoras = 0;
		
		for(int i = 1; i < series.length; i++) {
			if (series[i].compareTo(series[serieMasTemporadas])){
				serieMasTemporadas = i;
			}
			
			if (videojuegos[i].compareTo(videojuegos[videojuegoMasHoras])){
				videojuegoMasHoras = i;
			}
		} 
		
		System.out.println("\nLa serie con mas temporadas es " + series[serieMasTemporadas].getTitulo() + " con " + series[serieMasTemporadas].getNumTemporadas() + " temporadas.");
		System.out.println("El videojuego con mas horas estimadas es " + videojuegos[videojuegoMasHoras].getTitulo() + " con " + videojuegos[videojuegoMasHoras].getHorasEstimadas() + " horas.");
	}

}
