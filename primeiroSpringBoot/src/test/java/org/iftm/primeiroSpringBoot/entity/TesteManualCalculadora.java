package org.iftm.primeiroSpringBoot.entity;

public class TesteManualCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.parte:definir cenário do teste;
		//Instanciar os objetos a serem testados:
		Calculadora calculadora = new Calculadora();
		//definir a variáveis de entrada e resultado;
		//Entradas necessárias para o teste:
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		//saída Esperada:
		int resultadoEsperado= 15;
		//2.parte:executar a função a ser testada;
		calculadora.somar(entradaNumero1,entradaNumero2);
		int resultadoObitido = calculadora.getResultado();  
		//3.parte:verficar o resultado;
		if (resultadoEsperado == resultadoObitido){
			System.out.println("passou no teste");
		}
		else {
			System.out.println("nõ passou no teste");
		}
	}

}
