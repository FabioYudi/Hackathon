package com.brq.hackathon.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.brq.hackathon.model.RetornoAgencia;

@Service
public class ConsultaAgenciaExemploService {
	
	private Client client;
	private WebTarget webTarget;
	
	
	public RetornoAgencia consultaExemplo() {
		client = ClientBuilder.newClient();
		webTarget = client.target("http://10.2.1.173:3000");
		Response response = webTarget
				.path("bancos")
				.path("033")
				.path("agencias")
				.path("0001")
				.request()
				.get();
		
		return response.readEntity(RetornoAgencia.class);
	}
}
