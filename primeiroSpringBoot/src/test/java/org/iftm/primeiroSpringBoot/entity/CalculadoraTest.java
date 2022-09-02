package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
	public void testaSomaCorretaParaDoisReais() {
    	Calculadora calculadora = new Calculadora();
    	
    	int entradaNumero1 = -10;
    	int entradaNumero2 = 5;
		int resultadoEsperado =  -5;
    	
    	calculadora.somar(entradaNumero1 , entradaNumero2);
    	int resultadoObitido = calculadora.getResultado();
    	Assertions.assertEquals(resultadoEsperado,resultadoObitido);
    	
	}
    
    @Test
   	public void testaSubtracaoCorretaParaDoisReais() {
       	Calculadora calculadora = new Calculadora();
       	
       	int entradaNumero1 = 10;
       	int entradaNumero2 = 5;
   		int resultadoEsperado =  5;
       	
       	calculadora.subtrair(entradaNumero1 , entradaNumero2);
       	int resultadoObitido = calculadora.getResultado();
       	Assertions.assertEquals(resultadoEsperado,resultadoObitido);
       	
   	}
    
    @Test
   	public void testaMultiplicacaoCorretaParaDoisReais() {
       	Calculadora calculadora = new Calculadora();
       	
       	int entradaNumero1 = 10;
       	int entradaNumero2 = 5;
   		int resultadoEsperado =  50;
       	
       	calculadora.multiplicar(entradaNumero1 , entradaNumero2);
       	int resultadoObitido = calculadora.getResultado();
       	Assertions.assertEquals(resultadoEsperado,resultadoObitido);
       	
   	}
    
    @Test
   	public void testaDivisaoCorretaParaDoisReais() {
       	Calculadora calculadora = new Calculadora();
       	
       	int entradaNumero1 = 10;
       	int entradaNumero2 = 1;
   		int resultadoEsperado =  10;
       	
       	calculadora.dividir(entradaNumero1 , entradaNumero2);
       	int resultadoObitido = calculadora.getResultado();
       	Assertions.assertEquals(resultadoEsperado,resultadoObitido);
       	
   	}
}
