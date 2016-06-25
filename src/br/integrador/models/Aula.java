package br.integrador.models;

public class Aula {
	private Integer codigoAula;
	private Disciplina disciplina;
	private Turma turma;
	
	public Aula() {}
	public Aula(Integer codigoAula) {
		this.codigoAula = codigoAula;
	}
	public Integer getCodigoAula() {
		return codigoAula;
	}
	public void setCodigoAula(Integer codigoAula) {
		this.codigoAula = codigoAula;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}