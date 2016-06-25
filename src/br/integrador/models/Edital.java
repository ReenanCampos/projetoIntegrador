package br.integrador.models;
import java.util.ArrayList;
import java.util.List;
public class Edital {
	private Integer codigoEdital;
	private List<Candidato> candidatos;
	private Disciplina disciplina;
	
	public Edital() {
		this.candidatos = new ArrayList<Candidato>();
	}
	public Edital(Integer codigoEdital) {
		this.codigoEdital = codigoEdital;
		this.candidatos = new ArrayList<Candidato>();
	}
	public Integer getCodigoEdital() {
		return codigoEdital;
	}
	public void setCodigoEdital(Integer codigoEdital) {
		this.codigoEdital = codigoEdital;
	}
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
