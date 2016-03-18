package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

		@Id
		private int codigo;
		private String nome;
		private String materia;
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia) {
			this.materia = materia;
		}
}
