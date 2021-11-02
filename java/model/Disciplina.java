package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codDisciplina;
	private String nome;
	private String sigla;
	private Integer cargaHoraria;

	public Disciplina() {
	}

	public Disciplina(Integer codDisciplina, String nome, String sigla, Integer cargaHoraria) {
		this.codDisciplina = codDisciplina;
		this.nome = nome;
		this.sigla = sigla;
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(Integer codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
