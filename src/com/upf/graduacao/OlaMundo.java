package com.upf.graduacao;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//RECURSO - MESMO 
//JERSEY
@Path("/OlaMundo")
public class OlaMundo {

	//GET - Annotation
	@GET
	@Produces("text/plain") //MIME-TYPE  image/jpeg text/json
	public String respondeGet(){
		return "Nosso primeiro WS Rest respondendo GET";
	}
	
	//POST
	@POST
	@Produces("text/plain")
	public String testeDeNomeEscroto(){
		return "Só uma prova de que o nome não importa [POST]";
	}
	
	//EXERCICIO 1
	//FAÇAM COM QUE ESTE RECURSO RESPOSTA A UMA REQUISIÇÃO
	//PUT, RETORNANDO A DATA ATUAL (DICA, CLASSE DATE)
	@PUT
	@Produces("text/plain")
	public String respondeAoPut(){
		return new Date().toString();
	}
	
}
