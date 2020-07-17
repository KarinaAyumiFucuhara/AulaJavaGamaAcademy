package br.fucuhar.ex10_user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.fucuhar.ex10_user.dao.UserRepo;
import br.fucuhar.ex10_user.model.User;

@Component
public class UserServiceImp implements IUserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User buscaporID(int id) {
        return repo.findById(id).get();
    }

    

    
}