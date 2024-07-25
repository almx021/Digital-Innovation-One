package com.mendes.spring_web_rest_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mendes.spring_web_rest_api.handler.RequiredFieldException;
import com.mendes.spring_web_rest_api.model.User;

@Repository
public class UserRepository {
    public void save(User user) throws RequiredFieldException {
        if (user.getLogin() == null) throw new RequiredFieldException("login");
        if (user.getPassword() == null) throw new RequiredFieldException("password");
        
        if (user.getId() == null) 
            System.out.println("SAVE - Recebendo o usuario na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositório");
    
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DETETE/id - recebendo o id: %d para excluir um usuário", id));
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("André","password"));
        usuarios.add(new User("Lucas","masterpass"));
        return usuarios;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("André","password");
    }

    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User("André","password");
    }
}
