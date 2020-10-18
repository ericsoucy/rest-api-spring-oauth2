package com.example.restapispringoauth2.service;

import com.example.restapispringoauth2.model.Foo;

import java.util.Optional;


public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);

    Iterable<Foo> findAll();
}
