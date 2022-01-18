package com.cesarlucasjunior.personalbudget.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Receita {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty @NotNull
	private String descricao;
	@NotNull
	private BigDecimal valor;
	@NotNull
	private LocalDateTime data;
	
	public Receita() {}

	public Receita(String descricao, BigDecimal valor, LocalDateTime data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

}
