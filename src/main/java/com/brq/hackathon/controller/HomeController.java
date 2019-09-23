package com.brq.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brq.hackathon.model.RetornoAgencia;
import com.brq.hackathon.service.ConsultaAgenciaExemploService;


@Controller
public class HomeController {
	
	@Autowired
	private ConsultaAgenciaExemploService consultar;
	
	@GetMapping("/exemplos")
	public String carregaPaginaExemplos() {
		return "exemplos";
	}
	
	@GetMapping("/")
	public String carregaPaginaAgencias() {
		return "agencias";
	}
	
	
	//Exemplo chamada ajax
	@ResponseBody
	@GetMapping("/consultaViaAjax/exemplos")
	public RetornoAgencia consultarAgenciasAjax() {
		RetornoAgencia retornoConsulta = consultar.consultaExemplo();
		return retornoConsulta;
		
	}

	
	
	

}
