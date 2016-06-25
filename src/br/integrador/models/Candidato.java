package br.integrador.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Candidato extends Professor{
	private Integer codigoCandidato;
	private Integer posicaoCandidato;
	private List<Edital> editais;
	
	public Candidato() {
		this.editais = new ArrayList<Edital>();
	}
	public Candidato(Integer codigoCandidato, Integer posicaoCandidato) {
		this.codigoCandidato = codigoCandidato;
		this.posicaoCandidato = posicaoCandidato;
		this.editais = new ArrayList<Edital>();
	}
	public Candidato(String nome, String cPF, String rG, Date dataNascimento, String telefone, String email,
			String endereco, String login, String senha, boolean isDocumentador, boolean isParteNucleo,
			Integer codigoProfessor, Integer tempoServico, String escolaridade, String aperfeicoamento,
			Integer codigoCandidato, Integer posicaoCandidato) {
		super(nome, cPF, rG, dataNascimento, telefone, email, endereco, login, senha, isDocumentador, isParteNucleo,
				codigoProfessor, tempoServico, escolaridade, aperfeicoamento);
		this.codigoCandidato = codigoCandidato;
		this.posicaoCandidato = posicaoCandidato;
		this.editais = new ArrayList<Edital>();
	}
	public Integer getCodigoCandidato() {
		return codigoCandidato;
	}
	public void setCodigoCandidato(Integer codigoCandidato) {
		this.codigoCandidato = codigoCandidato;
	}
	public Integer getPosicaoCandidato() {
		return posicaoCandidato;
	}
	public void setPosicaoCandidato(Integer posicaoCandidato) {
		this.posicaoCandidato = posicaoCandidato;
	}
	public List<Edital> getEditais() {
		return editais;
	}
	public void setEditais(List<Edital> editais) {
		this.editais = editais;
	}
}
