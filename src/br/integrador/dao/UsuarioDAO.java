package br.integrador.dao;

import java.sql.Connection;
import java.util.List;

import br.integrador.models.Usuario;

public class UsuarioDAO {
	private Connection con;
	public UsuarioDAO(Connection con) {
		this.con=con;
	}
	
	public boolean inserirUsuario(Usuario u){return true;}
	public boolean alterarUsuario(Usuario u){return true;}
	public boolean deletarUsuario(Integer id){return true;}
	public Usuario getUsuario(Integer id){return null;}
	public List<Usuario> getTodosUsuarios(){return null;}
	
	private Connection getConnection(){
		return con;
	};
}
