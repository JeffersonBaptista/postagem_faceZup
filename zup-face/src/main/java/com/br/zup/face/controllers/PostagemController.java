package com.br.zup.face.controllers;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.face.models.PostagemModel;
import com.br.zup.face.services.PostagemService;

@Controller
public class PostagemController {
	
	@Autowired
	private PostagemService postagemService;
	
	@GetMapping	
	public ModelAndView exibirPosts(){
		ModelAndView modelAnsView = new ModelAndView("postagens.html");
		modelAnsView.addObject("postagens", postagemService.listaPostagem());
		return modelAnsView;
	}
	
	@GetMapping("/ola")
	public ModelAndView olaMundo() {
		ModelAndView modelAnsView = new ModelAndView("olaMundo.html");
		return modelAnsView;
	}
	@PostMapping
	public String novoPost(PostagemModel postagemModel) {
		postagemService.postar(postagemModel);
		return "redirect:/";
	}


}
