package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	//Variables Declarations
	@Column(name ="conta_numero")
	private Long numero;
	
	@Column(name ="conta_saldo")
	private Double saldo;
	
	//Getters and Setters
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
