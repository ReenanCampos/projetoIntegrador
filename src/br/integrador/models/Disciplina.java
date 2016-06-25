package br.integrador.models;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private Integer codigoDisciplina;
	private String nome;
	private String turmo;
	private String horario;
	private Edital edital;
	private List<Aula> aulas;
	private Professor professor;
	
	public Disciplina() {
		this.aulas = new ArrayList<Aula>();
	}
	public Disciplina(Integer codigoDisciplina, String nome, String turmo, String horario) {
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
		this.turmo = turmo;
		this.horario = horario;
		this.aulas = new ArrayList<Aula>();
	}
	public Integer getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(Integer codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurmo() {
		return turmo;
	}
	public void setTurmo(String turmo) {
		this.turmo = turmo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Edital getEdital() {
		return edital;
	}
	public void setEdital(Edital edital) {
		this.edital = edital;
	}
	public List<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
