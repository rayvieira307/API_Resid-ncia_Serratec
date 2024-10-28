package br.org.serratec.h2banco.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

import br.org.serratec.h2banco.exception.EnumValidationException;

public enum Categoria {
  HATCH, SEDAN, PICAPE,SUV,CONVERSIVEL,MINIVAN;
  
//vai criar uma categoria , se o valor for igual o name ok
//se nao ele lança uma exceccao 
//metodo
  @JsonCreator
  public static Categoria verifica(String valor) throws EnumValidationException{
	  for(Categoria c : values()) {
		  if(valor.equals(c.name())) {
			  return c;
		  }
	  }
	  
	  throw new EnumValidationException("Categoria preenchida incorretamente");
  }
}
