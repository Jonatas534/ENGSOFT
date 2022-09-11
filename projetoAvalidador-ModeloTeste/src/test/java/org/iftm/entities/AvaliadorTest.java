package org.iftm.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class AvaliadorTest {

	@Test
	public void testarMenorLanceSemOrdem() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		;
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(jose, 400.0));
		leiao.propoe(new Lance(maria, 250.0));
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 250.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMenorLance(),0.0001);
			
	}
	
	@Test
	public void testarMaiorLanceSemOrdem() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		;
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(jose, 400.0));
		leiao.propoe(new Lance(maria, 250.0));
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 400.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMaiorLance(),0.0001);
	}		
			

	@Test
	public void testarMenorLanceComOrdemCrescente() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		
		leiao.propoe(new Lance(maria, 250.0));
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(jose, 400.0));
	
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 250.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMenorLance(),0.0001);
	}
	
	

	
	@Test
	public void testarMaiorLanceComOrdemCrescente() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		leiao.propoe(new Lance(maria, 250.0));
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(jose, 400.0));
		
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 400.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMaiorLance(),0.0001);
			
	}
	
	@Test
	public void testarMenorLanceComOrdemDecrescente() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		
		leiao.propoe(new Lance(jose, 400.0));
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(maria, 250.0));
	
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 250.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMenorLance(),0.0001);
	}
	
	

	
	@Test
	public void testarMaiorLanceComOrdemDecrescente() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		leiao.propoe(new Lance(jose, 400.0));
		leiao.propoe(new Lance(joao, 300.0));
		leiao.propoe(new Lance(maria, 250.0));
		
		
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 400.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMaiorLance(),0.0001);
			
	}
	
	@Test
	public void testarMenorLanceComUmLance() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		
		
		leiao.propoe(new Lance(maria, 250.0));
	
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 250.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMenorLance(),0.0001);
	}
	
	@Test
	public void testarMaiorLanceSemLance() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 400.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMaiorLance(),0.0001);
			
	}
	
	@Test
	public void testarMenorLanceSemLance() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		Leilao leiao = new Leilao("Plastaytion 3 novo");
		Avaliador avaliador = new Avaliador();
		
		//Criar lances
		
		
	
		
		
		//Execução
		avaliador.avalia(leiao);
		
		//Comparações
		
		Double valorEsperado = 250.0;
		Assertions.assertEquals(valorEsperado,avaliador.getMenorLance(),0.0001);
	}
	
	
}
