package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import model.Disciplina;
import model.Professor;

public class DisciplinaControle {
	private EntityManager em;

	public  DisciplinaControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao_academica1");
		em = emf.createEntityManager();

		
		
	}
	public void inserir (Disciplina objeto) {
	    try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

			
		}
		public void alterar(Disciplina objeto) {
			
			  try {
		            em.getTransaction().begin();
		            em.merge(objeto);
		            em.getTransaction().commit();
		         } catch (Exception ex) {
		            ex.printStackTrace();
		            em.getTransaction().rollback();
		         }

		}
		public void excluir(Disciplina objeto) {
		      try {
		            em.getTransaction().begin();
		            em.remove(objeto);
		            em.getTransaction().commit();
		         } catch (Exception ex) {
		            ex.printStackTrace();
		            em.getTransaction().rollback();
		         }

			
		}
	public void  excluirPorId (Integer id) {
		
	    try {
            Disciplina objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            ex.printStackTrace();
         }


		
		
	}
		public Disciplina buscarPorId(Integer id) {
			
			
			
			return em.find(Disciplina.class, id);
		}
		
		
		
		public List<Disciplina> buscarTodos() {
			
			String nomeClasse = Disciplina.class.getName();
			return em.createQuery("FROM " + nomeClasse).getResultList();	
			
			
			
			
		}
		
		
		
		
		
		
	

}
