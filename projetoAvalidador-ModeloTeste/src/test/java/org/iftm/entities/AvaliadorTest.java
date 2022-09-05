package org.iftm.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class AvaliadorTest {

	@Test
	public void testarMaiorLanceSemOrdem() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		leiao.propoe(new Lance(joao, 300));
		leiao.propoe(new Lance(jose, 400));
		leiao.propoe(new Lance(maria, 250));
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 400.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMaiorLance(),0.0001);
		
		
		
		
	}

}
