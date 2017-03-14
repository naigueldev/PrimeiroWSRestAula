package com.upf.graduacao;

public class Pessoa {
	
	static public int nrMeninos;
	static public int nrMeninas;
	
	//STATIC = CLASSE 1
	//NÃO STATIC = INSTÂNCIA 0..N
	private char sexo;
	
	public Pessoa(char sexo){
		this.sexo = sexo;
		
		if (sexo == 'M'){
			nrMeninos++;
		} else {
			nrMeninas++;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	

}
