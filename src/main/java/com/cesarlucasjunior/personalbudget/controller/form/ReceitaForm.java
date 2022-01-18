package com.cesarlucasjunior.personalbudget.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.cesarlucasjunior.personalbudget.model.Receita;

public class ReceitaForm {

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String descricao;
	@NotNull
	private BigDecimal valor;
	@NotNull
	@NotEmpty
	private String dataCriacao;

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

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Receita converter() {
		return new Receita(this.getDescricao(), this.getValor(), LocalDate.parse(this.getDataCriacao(), DateTimeFormatter.ofPattern("dd/MM/uuuu")).atStartOfDay());
	}

}
