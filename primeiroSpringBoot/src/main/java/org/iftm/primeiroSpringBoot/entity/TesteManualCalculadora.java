package org.iftm.primeiroSpringBoot.entity;

public class TesteManualCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.parte:definir cenário do teste;
		//Instanciar os objetos a serem testados:
		Calculadora calculadora = new Calculadora();
		//definir a variáveis de entrada e resultado;
		//Entradas necessárias para o teste:
		double entradaNumero1 = 10;
		double entradaNumero2 = 5;
		//saída Esperada:
		double resultadoEsperado= 15;
		//2.parte:executar a função a ser testada;
		calculadora.somar(entradaNumero1,entradaNumero2);
		double resultadoObitido = calculadora.getResultado(entradaNumero1, entradaNumero2);
		//3.parte:verficar o resultado;
		if (resultadoEsperado == resultadoObitido){
			System.out.println("passou no teste");
		}
		else {
			System.out.println("nõ passou no teste");
		}
	}

}
