package com.cesarlucasjunior.personalbudget.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cesarlucasjunior.personalbudget.controller.dto.ReceitaDTO;
import com.cesarlucasjunior.personalbudget.controller.form.ReceitaForm;
import com.cesarlucasjunior.personalbudget.model.Receita;
import com.cesarlucasjunior.personalbudget.repository.ReceitaRepository;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
	
	@Autowired
	private ReceitaRepository receitaRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<ReceitaDTO> insert(@RequestBody @Valid ReceitaForm form, UriComponentsBuilder uriBuilder) {		
		Receita receita = receitaRepository.save(form.converter());
		URI uri = uriBuilder.path("/receitas/{id}").buildAndExpand(receita.getId()).toUri();
		return ResponseEntity.created(uri).body(new ReceitaDTO(receita));
	}
	
	@GetMapping
	public List<ReceitaDTO> search() {
		List<Receita> receita = receitaRepository.findAll();
		return ReceitaDTO.converter(receita);
	}

}
