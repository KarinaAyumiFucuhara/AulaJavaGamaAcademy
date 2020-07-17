package br.fucuhar.sample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.fucuhar.sample02.model.Departamento;

public interface DepartamentoRepo extends CrudRepository<Departamento, Integer>{

}
    
