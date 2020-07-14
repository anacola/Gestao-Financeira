package br.com.gestaofinanceira.gestao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tbl_usuario")
public class Usuario {
    	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idusuario")
	private int id;
	
	@Column(name="nome", length=100, nullable=false)
	private String nome;
	
	@Column(name="email", length=100, nullable=false, unique=true)
	private String email;
	
	@Column(name="apelido", length=50, nullable=false, unique=true)
	private String apelido;
	
	@Column(name="senha", length=30)
    private String senha;
    
    @Column(name = "linkfoto", length = 255)
    private String linkFoto;


    public String getLinkFoto() {
        return this.linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    
}