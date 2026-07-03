package com.callegari.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callegari.workshopmongo.domain.User;
import com.callegari.workshopmongo.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {

        List<User> list = repository.findAll();

        System.out.println("Usuarios encontrados: " + list.size());
        System.out.println(list);

        return list;
    }
}
