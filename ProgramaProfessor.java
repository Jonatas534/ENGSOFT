package view;

import java.util.Iterator;
import java.util.List;
import control.ProfessorControle;
import model.Professor;

public class ProgramaProfessor {
	public static void main(String[] args) {
		//inserindo 
		Professor novo = new Professor(null, "bruno");		
		ProfessorControle controle = new ProfessorControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(2); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getNome()); // substitua por um método get do seu projeto
		
		//modificando
		novo.setNome("bruno queiroz"); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
		
		//buscar todos
		List<Professor> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Professor obj = (Professor) iterator.next();
			System.out.println(obj.getNome());
		}
		
		//excluir
		controle.excluir(objetos.get(0));
		
		//excluir por id
		controle.excluirPorId(2); //o id 3 precisa existir no banco, modifique o valor	
	}
}

