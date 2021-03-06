package br.unb.cic.lp.gol.estrategias;

import br.unb.cic.lp.gol.GameEngine;
import br.unb.cic.lp.gol.Interfaces.EstrategiaDeDerivacao;

/**
 * Implementacao de uma estrategia de derivacao baseda nas 
 * regras LiveFreeOrDie. 
 * 
 * @author rbonifacio
 */

public class LiveFreeOrDie implements EstrategiaDeDerivacao {

	@Override
	public String getName() {
		return "LiveFreeOrDie";
	}

	@Override
	public boolean shouldKeepAlive(int i, int j, GameEngine engine) {
		return engine.numberOfNeighborhoodAliveCells(i, j) == 0;
	}

	@Override
	public boolean shouldRevive(int i, int j, GameEngine engine) {
		return engine.numberOfNeighborhoodAliveCells(i, j) == 2;
	}

}
