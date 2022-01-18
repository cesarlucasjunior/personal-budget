package com.cesarlucasjunior.personalbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarlucasjunior.personalbudget.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
