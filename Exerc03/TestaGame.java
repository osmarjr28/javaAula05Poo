package exercisesClass05.model;

import exercisesClass05.model.Game;

public class TestaGame {

	public static void main(String[] args) {
		
		Game g = new Game("Plastation 5", "Fifa 23", "Fone", "Controle", 1000.0f);
		
		g.visualizarGame();
		
		
		g.setJogo("Spider-man");
		g.setValor(100.0f);
		
		g.visualizarGame();
	}

}
