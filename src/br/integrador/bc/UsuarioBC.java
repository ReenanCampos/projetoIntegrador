package br.integrador.bc;

import br.integrador.models.Usuario;

public class UsuarioBC {
	private Usuario u;
	public UsuarioBC(Usuario u){
		this.u = u;
	}
	
	public boolean verificarSeLoginJaExiste(){Usuario aux = this.u; return true;}
	public boolean verificarSeSenhaEstaValida(){Usuario aux = this.u; return true;}
	public boolean verificarSeEmailEstaValido(){Usuario aux = this.u; return true;}
	public boolean verificarSeDadosDePessoaEstaoValidos(){Usuario aux = this.u; return true;}
	
}
