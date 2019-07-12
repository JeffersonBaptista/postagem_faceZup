package com.br.zup.face.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.zup.face.models.PostagemModel;

@Service
public class PostagemService {
	
	private Map<Integer, PostagemModel> listaPostagem = new HashMap<Integer, PostagemModel>() {
		{
			put(1, new PostagemModel("Jefferson","post","https://dw9to29mmj727.cloudfront.net/properties/2016/525-SeriesThumb_NARSHP_400x320.jpg"));

		}
	};
	
	public Collection<PostagemModel> listaPostagem(){
		return this.listaPostagem.values();
	}
	
	public void postar(PostagemModel postagemModel) {
		listaPostagem.put(listaPostagem.size()+1, postagemModel);
		
	}

}
