package com.cesarlucasjunior.personalbudget.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.cesarlucasjunior.personalbudget.model.Receita;

public class ReceitaDTO {

	private Long id;
	private String descricao;
	private BigDecimal valor;
	private LocalDateTime data;

	public ReceitaDTO(Receita receita) {
		this.id = receita.getId();
		this.descricao = receita.getDescricao();
		this.valor = receita.getValor();
		this.data = receita.getData();
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	public static List<ReceitaDTO> converter(List<Receita> listaDeReceitas) {
		List<ReceitaDTO> receitaDTO = new ArrayList<>();
		for(Receita receita : listaDeReceitas) {
			receitaDTO.add(new ReceitaDTO(receita));
		}		
		return receitaDTO;
	}

}
