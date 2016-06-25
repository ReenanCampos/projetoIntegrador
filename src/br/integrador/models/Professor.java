package br.integrador.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Professor extends Usuario{
	private Integer codigoProfessor;
	private Integer tempoServico;
	private String escolaridade;
	private String aperfeicoamento;
	private List<Dependente> dependentes;
	
	public Professor() {
		dependentes = new ArrayList<>();
	}
	public Professor(Integer codigoProfessor, Integer tempoServico, String escolaridade, String aperfeicoamento) {
		this.codigoProfessor = codigoProfessor;
		this.tempoServico = tempoServico;
		this.escolaridade = escolaridade;
		this.aperfeicoamento = aperfeicoamento;
		dependentes = new ArrayList<>();
	}
	public Professor(String nome, String cPF, String rG, Date dataNascimento, String telefone, String email,
			String endereco, String login, String senha, boolean isDocumentador, boolean isParteNucleo,
			Integer codigoProfessor, Integer tempoServico, String escolaridade, String aperfeicoamento) {
		super(nome, cPF, rG, dataNascimento, telefone, email, endereco, login, senha, isDocumentador, isParteNucleo);
		this.codigoProfessor = codigoProfessor;
		this.tempoServico = tempoServico;
		this.escolaridade = escolaridade;
		this.aperfeicoamento = aperfeicoamento;
		dependentes = new ArrayList<>();
	}
	public Integer getCodigoProfessor() {
		return codigoProfessor;
	}
	public void setCodigoProfessor(Integer codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}
	public Integer getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(Integer tempoServico) {
		this.tempoServico = tempoServico;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getAperfeicoamento() {
		return aperfeicoamento;
	}
	public void setAperfeicoamento(String aperfeicoamento) {
		this.aperfeicoamento = aperfeicoamento;
	}
	public List<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
}
