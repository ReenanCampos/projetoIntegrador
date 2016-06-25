package br.integrador.models;
import java.util.Date;
public class Usuario extends Pessoa{
	private String login;
	private String senha;
	private boolean isDocumentador;
	private boolean isParteNucleo;
	
	public Usuario() {}
	public Usuario(String login, String senha, boolean isDocumentador, boolean isParteNucleo) {
		this.login = login;
		this.senha = senha;
		this.isDocumentador = isDocumentador;
		this.isParteNucleo = isParteNucleo;
	}
	public Usuario(String nome, String cPF, String rG, Date dataNascimento, String telefone, String email,
			String endereco, String login, String senha, boolean isDocumentador, boolean isParteNucleo) {
		super(nome, cPF, rG, dataNascimento, telefone, email, endereco);
		this.login = login;
		this.senha = senha;
		this.isDocumentador = isDocumentador;
		this.isParteNucleo = isParteNucleo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isDocumentador() {
		return isDocumentador;
	}
	public void setDocumentador(boolean isDocumentador) {
		this.isDocumentador = isDocumentador;
	}
	public boolean isParteNucleo() {
		return isParteNucleo;
	}
	public void setParteNucleo(boolean isParteNucleo) {
		this.isParteNucleo = isParteNucleo;
	}
}

