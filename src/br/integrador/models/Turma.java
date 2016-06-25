package br.integrador.models;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Integer codigoTurma;
	private String nome;
	private List<Aula> aulas;
	
	public Turma() {}
	public Turma(Integer codigoTurma, String nome) {
		this.codigoTurma = codigoTurma;
		this.nome = nome;
		aulas = new ArrayList<Aula>();
	}
	public Integer getCodigoTurma() {
		return codigoTurma;
	}
	public void setCodigoTurma(Integer codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aula> getAulas() {
		return aulas;
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
}
