package br.integrador.models;

import java.util.Date;

public class Dependente extends Pessoa{
	public Professor professor;
	
	public Dependente() {}
	public Dependente(Professor professor) {
		this.professor = professor;
	}
	public Dependente(String nome, String cPF, String rG, Date dataNascimento, String telefone, String email,String endereco, Professor professor) {
		super(nome, cPF, rG, dataNascimento, telefone, email, endereco);
		this.professor = professor;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
