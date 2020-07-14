package br.com.gestaofinanceira.gestao.Dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gestaofinanceira.gestao.model.Usuario;


public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
    
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByApelidoAndSenha (String apelido, String senha);
	public Usuario findByApelidoOrEmail (String apelido,String email);
	
    
}