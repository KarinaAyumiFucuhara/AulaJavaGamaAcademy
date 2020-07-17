package br.fucuhar.ex10_user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.fucuhar.ex10_user.model.User;
import br.fucuhar.ex10_user.services.IUserService;

@RestController
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    private IUserService servico;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> buscarUserPorID(@PathVariable int id){
        User user = servico.buscaporID(id);
        
        if(user != null){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    } 
}