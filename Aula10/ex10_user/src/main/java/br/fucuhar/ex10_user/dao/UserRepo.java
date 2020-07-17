package br.fucuhar.ex10_user.dao;

import org.springframework.data.repository.CrudRepository;

import br.fucuhar.ex10_user.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    
    //public User findByUser(String nome_user);
}