package com.br.zup.face.models;

import java.util.Set;

public class PostagemModel {
	private String usuario;
	private String postagem;
	private String foto;

	public PostagemModel() {

	}

	public PostagemModel(String usuario, String postagem, String foto) {
		this.usuario = usuario;
		this.postagem = postagem;
		this.foto = foto;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Usuario: " + this.usuario);
		modelo.append("\nPost: " + this.postagem);

		return modelo.toString();

	}

}
