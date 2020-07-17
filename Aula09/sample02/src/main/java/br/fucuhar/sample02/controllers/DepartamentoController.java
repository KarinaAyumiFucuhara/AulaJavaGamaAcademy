package br.fucuhar.sample02.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.fucuhar.sample02.model.Departamento;
import br.fucuhar.sample02.services.IDepartamentoService;

@RestController
@CrossOrigin("*")
public class DepartamentoController {
    
    @Autowired
    private IDepartamentoService servico;

    @GetMapping("/departamento/{id}")
    public ResponseEntity<Departamento> buscarDepartamentoPorId(@PathVariable int id){
        Departamento depto = servico.buscarDeptoPorID(id);

        if(depto != null){
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/departamento/todos")
    public ResponseEntity<List<Departamento>> buscarTodosDepartamentos(){
        List<Departamento> depto = servico.buscarTodosDepartamentos();
        return ResponseEntity.ok(depto);
    }



}
