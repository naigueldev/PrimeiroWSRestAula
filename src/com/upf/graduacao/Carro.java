package com.upf.graduacao;

import javax.xml.bind.annotation.XmlRootElement;

//JERSEY - implementação - JAX-RS
//BINDING java <-> xml

@XmlRootElement
public class Carro {
		
	//ATRIBUTOS PRIVADOS
	private int id;
	private String marca;
	private String modelo;
	private short anoFabricacao;
	private long kilometragem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public short getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public long getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(long kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	//GETTERS SETTERS
	

}
