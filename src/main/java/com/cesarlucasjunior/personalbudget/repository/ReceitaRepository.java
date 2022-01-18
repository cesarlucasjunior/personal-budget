package com.cesarlucasjunior.personalbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarlucasjunior.personalbudget.model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {

}
