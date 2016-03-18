package sistema.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Professor;

public class ProfessorService {
	private EntityManagerFactory emf;

	public ProfessorService() {
		emf = Persistence.createEntityManagerFactory("ProjetoMavenJSFPrimeFaces");
	}
	
	public void Salvar(Professor professor){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
			em.persist(professor);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Professor> getProfessor(){
		
		List<Professor> professores;
	
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select p from Professor p");
		professores = q.getResultList();
		em.close();
		
		return professores;
	
	}
}
